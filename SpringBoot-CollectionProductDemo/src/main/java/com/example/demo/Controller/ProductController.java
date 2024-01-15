package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	ProductService productservice;
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product products) {
		
		return productservice.addNewProduct(products);
	}
	
}
