package com.github.javafaker.pharma;

public class PrimaryPackagingComponent {
	private String componentType; // e.g., Vial, Syringe, Stopper
	private String manufacturer;
	private String materialSpecs; // e.g., Type I Glass, HDPE, Rubber
	private String storageConditions; // e.g., "Store at 15-25°C, away from direct sunlight"

	public PrimaryPackagingComponent(String componentType, String manufacturer, String materialSpecs,
			String storageConditions) {
		super();
		this.componentType = componentType;
		this.manufacturer = manufacturer;
		this.materialSpecs = materialSpecs;
		this.storageConditions = storageConditions;
	}

	public PrimaryPackagingComponent() {
		super();
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMaterialSpecs() {
		return materialSpecs;
	}

	public void setMaterialSpecs(String materialSpecs) {
		this.materialSpecs = materialSpecs;
	}

	public String getStorageConditions() {
		return storageConditions;
	}

	public void setStorageConditions(String storageConditions) {
		this.storageConditions = storageConditions;
	}

}
