package com.shop.shop.repository;

import com.shop.shop.entity.Coupon;
import com.shop.shop.entity.Member;

public interface CouponRepositoryCustom {
    void gainCoupon(Coupon coupon, Member member);
}
