package com.shop.shop.service;

import com.shop.shop.dto.CommentFormDto;
import com.shop.shop.entity.Comment;
import com.shop.shop.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }
}
