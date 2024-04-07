package com.example.demo.service;

import com.example.demo.dto.PostRequest;
import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void save(PostRequest postRequest) {
        Post post = new Post();
        post.setTitle(postRequest.getTitle());
        post.setContent(postRequest.getContent());
        post.setImage(postRequest.getImage());
        postRepository.save(post);
    }

    public void update(PostRequest postRequest) {
        Post post = new Post();
        post.setId(postRequest.getId());
        post.setTitle(postRequest.getTitle());
        post.setContent(postRequest.getContent());
        post.setImage(postRequest.getImage());
        postRepository.save(post);
    }

    public Post getPost(Long id) {
        return postRepository.findById(id).get();
    }

    public void delete(Long id) {
        postRepository.deleteById(id);
    }

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }
}






