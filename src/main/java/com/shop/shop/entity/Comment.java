package com.shop.shop.entity;

import com.shop.shop.dto.CommentFormDto;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Comment extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String text;

    @Column
    private Long itemId;


    public Comment() {

    }


}
