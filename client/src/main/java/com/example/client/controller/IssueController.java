package com.example.client.controller;

import com.example.client.model.Issue;
import com.example.client.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;
import com.example.client.converter.IssueConverter;
import com.example.client.model.IssueDTO;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/issue")
@RestController
public class IssueController {

    @Autowired
    private IssueService service;
    private RestTemplate restTemplate = new RestTemplate();
    private IssueConverter issueConverter = new IssueConverter();


    @GetMapping("/issues")
    public List<Issue> list() {
        return service.listAll();
    }

    @GetMapping("/issues/{id}")
    public List<Issue> SelectIssueByClient(@PathVariable Integer id) {
        return service.SelectIssueByClient(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Issue> getById(@PathVariable Integer id){
        try {
            Issue issue = service.get(id);
            return new ResponseEntity<Issue>(issue, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Issue>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public int add(@RequestBody Issue issue) {
        try {
            service.save(issue);
            IssueDTO issueDTO= issueConverter.Response(issue);
            ResponseEntity<IssueDTO> response=restTemplate.postForEntity("http://localhost:53802/api/Issue",issueDTO, IssueDTO.class);
            return 1;
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Issue> update( @RequestBody IssueDTO issue) {

        try{
            Issue existingIssue = service.SelectIssueByReportNumber(issue.getReportNumber());
            service.update(issueConverter.Request(issue,existingIssue));
            return new ResponseEntity<Issue>(existingIssue, HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<Issue>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }


}
