package com.example.demo.controller;

import com.example.demo.dto.PostRequest;
import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/create")
    public ResponseEntity<Post> create(@RequestBody PostRequest postRequest) {
        postService.save(postRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Post> update(@RequestBody PostRequest postRequest) {
        postService.update(postRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> get(@PathVariable Long id) {
        return new ResponseEntity<>(postService.getPost(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Post> delete(@PathVariable Long id) {
        postService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Post>> getAll() {
        return new ResponseEntity<>(postService.getAllPost(), HttpStatus.OK);
    }
}





