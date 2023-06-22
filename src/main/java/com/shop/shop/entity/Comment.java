package com.shop.shop.entity;

import com.shop.shop.dto.CommentFormDto;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Comment extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String commentText;

    @JoinColumn(name="item_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;


    public Comment() {
    }



}
