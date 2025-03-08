package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/product")
	public String getProduct()
	{
		return "sucessfully got the product";
	}
	@GetMapping("/getall")
	public String allProducts() {
		return "all";
	}

}
