package com.github.javafaker.pharma;

public class Product {
	private String description;
	private String productCode;
	private String formula;
	private String dosageForm;
	private String strength;

	public Product(String description, String productCode, String formula, String dosageForm, String strength) {
		super();
		this.description = description;
		this.productCode = productCode;
		this.formula = formula;
		this.dosageForm = dosageForm;
		this.strength = strength;
	}

	public Product() {
		super();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getDosageForm() {
		return dosageForm;
	}

	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

}
