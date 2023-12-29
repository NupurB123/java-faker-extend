package com.github.javafaker.pharma;

import java.util.Date;

public class Recipe {
	private String productName;
	private String recipeName;
	private String formula;
	private Date createdAt;
	private Date updatedAt;

	public Recipe(String productName, String recipeName, String formula, Date createdAt, Date updatedAt) {
		super();
		this.productName = productName;
		this.recipeName = recipeName;
		this.formula = formula;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Recipe() {
		super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
