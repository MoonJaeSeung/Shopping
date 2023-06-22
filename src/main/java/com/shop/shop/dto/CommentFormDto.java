package com.shop.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.internal.LoadingCache;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentFormDto {

    private String commentText;

    private Long itemId;

    private String createdBy;

    public CommentFormDto(String commentText, Long itemId,String createdBy) {
        this.commentText = commentText;
        this.itemId = itemId;
        this.createdBy = createdBy;
    }
}
