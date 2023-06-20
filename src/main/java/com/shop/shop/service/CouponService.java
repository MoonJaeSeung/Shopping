package com.shop.shop.service;

import com.shop.shop.dto.CouponDto;
import com.shop.shop.entity.Coupon;
import com.shop.shop.entity.Member;
import com.shop.shop.exception.DuplicateCouponException;
import com.shop.shop.repository.CouponRepository;
import com.shop.shop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class CouponService {

    private final CouponRepository couponRepository;
    private final MemberRepository memberRepository;



    public Long saveCoupon(CouponDto couponDto){

        Coupon coupon = couponDto.createCoupon();
        couponRepository.save(coupon);

        return coupon.getId();
    }

    public List<CouponDto> getCoupon(){

        List<Coupon> coupons = couponRepository.findAll();
        List<Coupon> validCoupons = coupons.stream()
                .filter(coupon -> !coupon.isExpired())
                .collect(Collectors.toList());
        List<CouponDto> couponDtoList = new ArrayList<>();
        for (Coupon coupon : validCoupons) {
            CouponDto couponDto = CouponDto.of(coupon);
            couponDtoList.add(couponDto);
        }
        return couponDtoList;
    }

    public void deleteCoupon(Long id){
        couponRepository.deleteById(id);
    }


//    public void gainCoupon(Long id, String email) {
//        Coupon coupon = couponRepository.findById(id)
//                .orElseThrow(EntityNotFoundException::new);
//        Member member = memberRepository.findByEmail(email);
//
//        List<Coupon> coupon1 = member.getCoupon();
//        for (Coupon coupon2 : coupon1) {
//            if(coupon2.getId() == id){
//                throw new DuplicateCouponException("이미 가지고 있는 쿠폰입니다", 1000);
//            }
//        }
//        couponRepository.gainCoupon(coupon, member);
//    }
}
