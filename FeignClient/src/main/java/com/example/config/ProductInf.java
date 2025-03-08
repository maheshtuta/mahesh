package com.example.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="PRODUCTAPI", url="https://localhost:8081")
public interface ProductInf {
	@GetMapping("/product")
	public String getProduct();
	@GetMapping("/getall")
	public String allProducts();

}
