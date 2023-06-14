package com.shop.shop.repository;

import com.shop.shop.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface CouponRepository extends JpaRepository<Coupon,Long>, QuerydslPredicateExecutor<Coupon>,CouponRepositoryCustom {


}


// QuerydslPredicateExecutor<Item>,ItemRepositoryCustom