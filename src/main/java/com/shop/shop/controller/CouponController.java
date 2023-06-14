package com.shop.shop.controller;

import com.shop.shop.dto.CouponDto;
import com.shop.shop.entity.Coupon;
import com.shop.shop.repository.CouponRepository;
import com.shop.shop.repository.MemberRepository;
import com.shop.shop.service.CouponService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CouponController {

    private final MemberRepository memberRepository;
    private final CouponService couponService;
    private final CouponRepository couponRepository;

    @GetMapping("/admin/coupon/new")
    public String couponNew(Model model){
        model.addAttribute("couponDto", new CouponDto());
        return "coupon/couponForm";
    }

    @PostMapping("/admin/coupon/new")
    public String saveCoupon(@Valid CouponDto couponDto, BindingResult bindingResult, Principal principal) {
//        if (bindingResult.hasErrors()) {
//            return "coupon/couponForm";
//        }

        couponService.saveCoupon(couponDto);

        return "redirect:/";

    }

    @GetMapping(value = "/admin/coupons")
    public String couponManage(Model model){
        List<CouponDto> couponDtoList = couponService.getCoupon();
        model.addAttribute("couponList", couponDtoList);
        return "/coupon/couponList";
    }

    @GetMapping(value = "/coupon/list")
    public String couponList(Model model, Principal principal){
        String name = principal.getName();
        List<Coupon> couponsOwn = memberRepository.findByEmail(name).getCoupon();
        List<Long> ids = new ArrayList<>();
        for (Coupon coupon : couponsOwn) {
            ids.add(coupon.getId());
        }

        List<CouponDto> coupons = couponService.getCoupon();
        model.addAttribute("coupons", coupons);
        model.addAttribute("ids", ids);
        return "coupon/couponChoice";
    }

    @PostMapping(value = "/coupon/delete/{id}")
    public String deleteCoupon(@PathVariable("id") Long id) {

        couponService.deleteCoupon(id);
        return "redirect:/admin/coupons";
    }
}
