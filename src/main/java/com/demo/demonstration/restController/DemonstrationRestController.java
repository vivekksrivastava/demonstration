package com.demo.demonstration.restController;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demonstration.model.CategoryProductMap;
import com.demo.demonstration.model.Product;

@RestController
public class DemonstrationRestController {
	
	@Autowired
	CategoryProductMap cpm;
	
	/*@Autowired
	ProductMap pm; */
	
	@GetMapping("/productsWithCategory")
	public LinkedHashMap<String, ArrayList<Product>> getProducts() {
		return cpm.getProductList();
	}

	@GetMapping("/products")
	public ArrayList<Product> getAllProducts() {
		return cpm.getAllProducts();
	}
	
	@GetMapping("/products/{category}")
	public ArrayList<Product> getProductsByCategory(@PathVariable String category) {
		
		return cpm.getProductsByCategory(category);
		
		
	}
	
	
}
