package com.example.client.controller;

import com.example.client.converter.CommentConverter;
import com.example.client.converter.IssueConverter;
import com.example.client.model.ClientDTO;
import com.example.client.model.Comment;
import com.example.client.model.CommentDTO;
import com.example.client.model.Issue;
import com.example.client.model.IssueDTO;
import com.example.client.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/comment")
@RestController
public class CommentController {

    @Autowired
    private CommentService service;
    @Autowired
    private CommentConverter commnetConverter;


    @GetMapping("/comments")
    public List<Comment> list() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getById(@PathVariable Integer id){
        try {
            Comment comment = service.get(id);
            return new ResponseEntity<Comment>(comment, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/comments/{id}")
    public List<Comment> SelectCommentByIssue(@PathVariable Integer id) {
        return service.SelectCommentByIssue(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public int add(@RequestBody Comment comment) {
        try {
            service.save(comment);
            return 1;
        } catch (NoSuchElementException e) {
            return 0;
        }
    }
    
    @RequestMapping(path = "/addCommentDTo", method = RequestMethod.POST)
    public int addCommentDTO(@RequestBody CommentDTO commentDTO) {
        try {
        	Comment comment = commnetConverter.Response(commentDTO);
            service.save(comment);
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
