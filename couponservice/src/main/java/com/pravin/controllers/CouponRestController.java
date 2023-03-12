package com.pravin.controllers;

import com.pravin.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pravin.repos.CouponRepo;


@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	CouponRepo repo;

	@PostMapping("coupon")
	public Coupon createCoupon(@RequestBody Coupon coupon){
		repo.save(coupon);
		return coupon;
	}

	@GetMapping("coupon/{code}")
	public Coupon getCoupon(@PathVariable String code){
		Coupon coupon = repo.findByCode(code);
		return coupon;
	}

}