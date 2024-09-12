package com.ticket360.api.controller;

import com.ticket360.api.domain.coupon.Coupon;
import com.ticket360.api.domain.coupon.CouponRequestDTO;
import com.ticket360.api.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping("/coupon/{eventiId}")
    public ResponseEntity<Coupon> addCouponToEvent(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data) {
        Coupon coupons = couponService.addCouponToEvent(eventId, data);
        return ResponseEntity.ok(coupons);
    }

}
