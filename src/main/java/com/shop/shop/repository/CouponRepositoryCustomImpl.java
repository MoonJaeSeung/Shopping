package com.shop.shop.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shop.shop.entity.Coupon;
import com.shop.shop.entity.Member;
import com.shop.shop.entity.QCoupon;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.Optional;

public class CouponRepositoryCustomImpl implements CouponRepositoryCustom {

    private JPAQueryFactory queryFactory;

    public CouponRepositoryCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public void gainCoupon(Coupon coupon, Member member) {
        member.getCoupon().add(coupon);
    }
}
