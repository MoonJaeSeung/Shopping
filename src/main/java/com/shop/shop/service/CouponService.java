package com.shop.shop.service;

import com.shop.shop.dto.CouponDto;
import com.shop.shop.entity.Coupon;
import com.shop.shop.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CouponService {

    private final CouponRepository couponRepository;
    public Object deleteCoupon;


    public Long saveCoupon(CouponDto couponDto){

        Coupon coupon = couponDto.createCoupon();
        couponRepository.save(coupon);

        return coupon.getId();
    }

    public List<CouponDto> getCoupon(){

        List<Coupon> coupons = couponRepository.findAll();
        List<CouponDto> couponDtoList = new ArrayList<>();
        for (Coupon coupon : coupons) {
            CouponDto couponDto = CouponDto.of(coupon);
            couponDtoList.add(couponDto);
        }
        return couponDtoList;
    }

    public void deleteCoupon(Long id){
        couponRepository.deleteById(id);
    }


}
