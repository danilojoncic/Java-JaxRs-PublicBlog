package com.example.domaci5_1.repository.abstraction;

import com.example.domaci5_1.entity.Post;

import java.util.List;

public interface PostInterfaceRepo {
    public Post getOnePost(int id);
    public List<Post> getAllPosts();
    public Post addPost(Post post);
}
