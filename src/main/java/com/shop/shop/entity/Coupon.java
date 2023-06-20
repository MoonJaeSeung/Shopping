package com.shop.shop.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter @Setter
@ToString
public class Coupon {

    @Id
    @GeneratedValue
    @Column(name="coupon_id")
    private Long id;

    private String couponNm;

    private LocalDateTime deadLine;

    //할인 금액
    private int dis_price;

    //할인 비율
    private int dis_ratio;

    public Coupon(String couponNm, LocalDateTime deadLine, int dis_price, int dis_ratio) {
        this.couponNm = couponNm;
        this.deadLine = deadLine;
        this.dis_price = dis_price;
        this.dis_ratio = dis_ratio;
    }

    public boolean isExpired(){
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.isAfter(deadLine);
    }

}
