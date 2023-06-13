package com.shop.shop.controller;

import com.shop.shop.dto.CouponDto;
import com.shop.shop.entity.Coupon;
import com.shop.shop.service.CouponService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CouponController {

    private final CouponService couponService;

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

        log.info("여기까진 왔어");
        return "redirect:/";

    }
}
