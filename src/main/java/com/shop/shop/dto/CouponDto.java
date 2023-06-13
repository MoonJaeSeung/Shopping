package com.shop.shop.dto;

import com.shop.shop.entity.Coupon;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter @Setter
public class CouponDto {

    private Long id;

    @NotBlank(message = "쿠폰명은 필수 입력 값입니다.")
    private String couponNm;

    @NotBlank(message = "마감기한은 필수 입력 값입니다.")
    private LocalDateTime deadLine;

    //할인 금액
    private int dis_price;

    //할인 비율
    private int dis_ratio;

    private static ModelMapper modelMapper = new ModelMapper();

    public static CouponDto of(Coupon coupon) {
        return modelMapper.map(coupon, CouponDto.class);
    }

    public Coupon createCoupon(){
        return modelMapper.map(this, Coupon.class);
    }
}
