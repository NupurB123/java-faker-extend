package com.github.javafaker.pharma;

public class Material {
	private String materialCode;
	private String name;
	private String classification;
	private String qualityAttributes;
	private String supplier;
	private int inventoryLevel;
	private String storageCondition;

	public Material(String materialCode, String name, String classification, String qualityAttributes, String supplier,
			int inventoryLevel, String storageCondition) {
		super();
		this.materialCode = materialCode;
		this.name = name;
		this.classification = classification;
		this.qualityAttributes = qualityAttributes;
		this.supplier = supplier;
		this.inventoryLevel = inventoryLevel;
		this.storageCondition = storageCondition;
	}

	public Material() {
		super();
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getQualityAttributes() {
		return qualityAttributes;
	}

	public void setQualityAttributes(String qualityAttributes) {
		this.qualityAttributes = qualityAttributes;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public int getInventoryLevel() {
		return inventoryLevel;
	}

	public void setInventoryLevel(int inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}

	public String getStorageCondition() {
		return storageCondition;
	}

	public void setStorageCondition(String storageCondition) {
		this.storageCondition = storageCondition;
	}

}
