package com.example.domaci5_1.repository;

import com.example.domaci5_1.entity.Post;
import com.example.domaci5_1.repository.abstraction.PostInterfaceRepo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PostRepository implements PostInterfaceRepo {
    public static List<Post> sveObjave = new CopyOnWriteArrayList<>();

    @Override
    public Post getOnePost(int id) {
        return sveObjave.get(id);
    }

    @Override
    public synchronized List<Post> getAllPosts() {
        return new ArrayList<>(sveObjave);
    }

    @Override
    public synchronized Post addPost(Post post) {
        int postId = sveObjave.size();
        post.setId(postId);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm MM.dd.yyyy");
        post.setDate(simpleDateFormat.format(date));
        sveObjave.add(Math.toIntExact(postId), post);
        return post;
    }
}
