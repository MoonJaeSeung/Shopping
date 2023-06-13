package com.shop.shop.service;

import com.shop.shop.dto.CouponDto;
import com.shop.shop.entity.Coupon;
import com.shop.shop.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CouponService {

    private final CouponRepository couponRepository;

    public Long saveCoupon(CouponDto couponDto){

        Coupon coupon = couponDto.createCoupon();
        couponRepository.save(coupon);

        return coupon.getId();
    }
}
