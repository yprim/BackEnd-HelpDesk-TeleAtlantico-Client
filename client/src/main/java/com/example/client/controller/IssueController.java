package com.example.client.controller;

import com.example.client.model.Issue;
import com.example.client.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/issue")
@RestController
public class IssueController {

    @Autowired
    private IssueService service;


    @GetMapping("/issues")
    public List<Issue> list() {
        return service.listAll();
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
            return 1;
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }


}
