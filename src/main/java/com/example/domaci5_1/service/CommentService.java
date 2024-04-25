package com.example.domaci5_1.service;

import com.example.domaci5_1.entity.Comment;
import com.example.domaci5_1.repository.abstraction.CommentInterfaceRepo;

import javax.inject.Inject;
import java.util.List;

public class CommentService {
    public CommentService() {
        System.out.println(this);
    }

    @Inject
    private CommentInterfaceRepo commentInterfaceRepo;

    //
    public Comment addComment(Comment comment) {
        return this.commentInterfaceRepo.addComment(comment);
    }

    public List<Comment> allComments(int id) {
        return this.commentInterfaceRepo.allCommentsForPost(id);
    }
}
