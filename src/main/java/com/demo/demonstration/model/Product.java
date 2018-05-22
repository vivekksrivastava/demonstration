package com.demo.demonstration.model;

import java.util.List;

public class Product {

	int id;
	String name;
	String description;
	List<String> relatedProducts;
	String imageUrl;
	public Product(int id, String name, String description, List<String> relatedProducts, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.relatedProducts = relatedProducts;
		this.imageUrl = imageUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getRelatedProducts() {
		return relatedProducts;
	}
	public void setRelatedProducts(List<String> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", relatedProducts="
				+ relatedProducts + ", imageUrl=" + imageUrl + "]";
	}
	public Product() {}
	
	
	
	
}
