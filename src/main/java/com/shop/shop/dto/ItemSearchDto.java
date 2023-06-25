package com.shop.shop.dto;

import com.shop.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class ItemSearchDto {

    //날짜
    private String searchDateType;

    //판매 현황
    private ItemSellStatus searchSellStatus;

    //상품명 or 등록자
    private String searchBy;

    //검색어
    private String searchQuery = "";

}


