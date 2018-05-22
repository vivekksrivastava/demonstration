package com.demo.demonstration.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

@Component
public class CategoryProductMap {

	public CategoryProductMap() {}

	static LinkedHashMap<String, ArrayList<Product>> productList = new LinkedHashMap<>();



	public LinkedHashMap<String, ArrayList<Product>> getProductList() {
		return productList;
	}










	public static void setProductList(LinkedHashMap<String, ArrayList<Product>> productList) {
		CategoryProductMap.productList = productList;
	}










	public void addObj(String category, Product pm) {
		List<Product> list = CategoryProductMap.productList.get(category);
		if(null == list)
		{
			list = new ArrayList<Product>();
			list.add(pm);
			CategoryProductMap.productList.put(category, (ArrayList<Product>) list);
		}
		else
		list.add(pm);	
		
	}
	
	public ArrayList<Product> getProductsByCategory(String category)
	{
		return CategoryProductMap.productList.get(category);
	}


	public ArrayList<Product> getAllProducts() {
		ArrayList<Product> al = new ArrayList<>();
		for(Entry<String, ArrayList<Product>> entry : (CategoryProductMap.productList).entrySet())
		{
			for(Product pm : entry.getValue()) {
				al.add(pm);
				System.out.println(pm.getId());
			}
		}
		return al;
	}
	
	
}
