package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
@Service
public class ProductService {

	
	public static int count=3;
	public static List<Product> products=new ArrayList<>();
	
	static {
		products.add(new Product(1,"salt",10));
		products.add(new Product(2,"honey",100));
		products.add(new Product(3,"milk",40));
	}
	
	public Product addNewProduct(Product product1) {
		product1.setPid(++count);
		products.add(product1);
		return product1;
		
	}
	
}
