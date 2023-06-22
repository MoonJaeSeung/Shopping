package com.shop.shop.controller;

import com.shop.shop.dto.CommentFormDto;
import com.shop.shop.dto.ItemFormDto;
import com.shop.shop.entity.Comment;
import com.shop.shop.entity.Item;
import com.shop.shop.repository.ItemRepository;
import com.shop.shop.service.CommentService;
import com.shop.shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/comments")
@Controller
@RequiredArgsConstructor
public class CommentController {

    private final ItemService itemService;

    @Autowired
    CommentService commentService;

    @Autowired
    ItemRepository itemRepository;

    @PostMapping(value = "/new")
    public String saveComment(@ModelAttribute CommentFormDto commentFormDto, Model model) {
        String commentText = commentFormDto.getCommentText();
        Long itemId = commentFormDto.getItemId();

        Item item = itemRepository.findById(itemId).get();

        Comment comment = new Comment();

        comment.setCommentText(commentText);
        comment.setItem(item);

        Comment savedComment = commentService.save(comment);

        ItemFormDto itemFormDto = itemService.getItemDtl(itemId);
        System.out.println("savedComment = " + savedComment.toString());
        model.addAttribute("comments", savedComment);
        model.addAttribute("item", itemFormDto);
        return "test";
//        return "item/itemDtl";
    }


    @GetMapping("/fetch/{itemId}")
    @ResponseBody
//    @RequestMapping(produces = "application/json")
    public List<Comment> fetchComments(@PathVariable("itemId") Long itemId) {
        System.out.println("shot");
        List<Comment> comments = commentService.find(itemId);
        System.out.println(" asdsad");
        return comments;
    }

    @PostMapping("/comments/new")
    public void submitComment(@RequestParam("commentText") String commentText,
                              @RequestParam("itemId") Long itemId) {
        // Code to create a new comment
    }

//    @GetMapping(value="/itemDtl/{itemId}")
//    public String commentItem(@PathVariable("itemId") Long itemId, Model model){
//        Item item = itemRepository.findById(itemId).get();
//
//        List<Comment> comments = commentService.find(itemId);
//        ItemFormDto itemFormDto = itemService.getItemDtl(itemId);
//
//        model.addAttribute("item",itemFormDto);
//        model.addAttribute("comments",comments);
//        return "item/itemDtl";
//    }

}
