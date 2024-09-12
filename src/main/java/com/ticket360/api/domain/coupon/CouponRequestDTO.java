package com.ticket360.api.domain.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
