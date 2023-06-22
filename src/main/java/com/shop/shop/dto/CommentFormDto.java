package com.shop.shop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentFormDto {

    private String commentText;

    private Long itemId;
}
