package com.example.domaci5_1.repository.abstraction;

import com.example.domaci5_1.entity.Comment;

import java.util.List;

public interface CommentInterfaceRepo {
    public Comment addComment(Comment comment);
    public List<Comment> allCommentsForPost(int postId);
}
