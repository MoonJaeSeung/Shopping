package com.shop.shop.dto;

import com.shop.shop.entity.Coupon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponDto {

    private Long id;

    @NotBlank(message = "쿠폰명은 필수 입력 값입니다.")
    private String couponNm;

    @NotNull(message = "마감기한은 필수 입력 값입니다.")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime deadLine;

    //할인 금액
    private Integer dis_price;

    //할인 비율
    private Integer dis_ratio;

    private static ModelMapper modelMapper = new ModelMapper();

    public static CouponDto of(Coupon coupon) {
        return modelMapper.map(coupon, CouponDto.class);
    }

    public Coupon createCoupon(){
        return modelMapper.map(this, Coupon.class);
    }
}
