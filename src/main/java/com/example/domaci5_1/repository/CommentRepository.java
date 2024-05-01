package com.example.domaci5_1.repository;

import com.example.domaci5_1.entity.Comment;
import com.example.domaci5_1.repository.abstraction.CommentInterfaceRepo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CommentRepository implements CommentInterfaceRepo {
    public static List<Comment> sviKomentari = new CopyOnWriteArrayList<>();

    @Override
    public synchronized Comment addComment(Comment comment) {
        int id = sviKomentari.size();
        comment.setId(id);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm MM.dd.yyyy");
        comment.setDate(simpleDateFormat.format(date));
        sviKomentari.add(Math.toIntExact(id), comment);
        return comment;
    }

    @Override
    public synchronized List<Comment> allCommentsForPost(int postId) {
        List<Comment> allCommentsOfAPost = new ArrayList<>();
        for (Comment comment : sviKomentari) {
            if(comment.getPostId() == postId){
                allCommentsOfAPost.add(comment);
            }
        }
        return allCommentsOfAPost;
    }
}
