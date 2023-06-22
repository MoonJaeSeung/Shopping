package com.shop.shop.dto;

import com.shop.shop.entity.OrderItem;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter @Setter
public class OrderItemDto {


    public OrderItemDto(OrderItem orderItem, String imgUrl) {
        this.itemNm = orderItem.getItem().getItemNm();
        this.count = orderItem.getCount();
        this.orderPrice = orderItem.getOrderPrice();
        this.imgUrl = imgUrl;
    }

    @Nullable
    private String itemNm;

    private int count;

    private int orderPrice;

    private String imgUrl;
}
