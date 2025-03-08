package com.example.feigncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.ProductInf;

@RestController
public class ControllerFeign {
	
	@Autowired
	ProductInf prod;
	
	@GetMapping("/oneproduct")
	public String product()
	{
		return prod.getProduct();
	}
	@GetMapping("/productsall")
	public String prductsAll()
	{
		return prod.allProducts();
	}

}
