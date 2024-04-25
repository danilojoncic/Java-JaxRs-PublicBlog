package com.example.domaci5_1.service;

import com.example.domaci5_1.entity.Post;
import com.example.domaci5_1.repository.abstraction.PostInterfaceRepo;

import javax.inject.Inject;
import java.util.List;

public class PostService {
    public PostService() {
        System.out.println(this);
    }

    @Inject
    private PostInterfaceRepo postInterfaceRepo;

    //
    public Post addPost(Post post) {
        return this.postInterfaceRepo.addPost(post);
    }
    public List<Post> allPosts() {
        return this.postInterfaceRepo.getAllPosts();}

    public Post findPost(int postId) {
        return this.postInterfaceRepo.getOnePost(postId);
    }}
