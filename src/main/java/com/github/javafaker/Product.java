package com.github.javafaker;

public class Product {

	private String name;
	private String description;
	private String productType;

	public Product(String name, String description, String productType) {
		this.name = name;
		this.description = description;
	}

	public Product() {

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

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
}
