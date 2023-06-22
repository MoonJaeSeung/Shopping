package com.shop.shop.controller;

import com.shop.shop.dto.CommentFormDto;
import com.shop.shop.entity.Comment;
import com.shop.shop.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/comments")
@Controller
@RequiredArgsConstructor
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping(value="/new")
    public String saveComment(@ModelAttribute CommentFormDto commentFormDto, Model model){
        String commentText = commentFormDto.getCommentText();
        Long itemId = commentFormDto.getItemId();


        Comment comment = new Comment();

        comment.setText(commentText);
        comment.setItemId(itemId);


        System.out.println("comment.toString() = " + comment.toString());
        commentService.save(comment);

        return "test";
    }

}
