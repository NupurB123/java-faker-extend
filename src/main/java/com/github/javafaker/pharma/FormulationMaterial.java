package com.github.javafaker.pharma;

import java.util.Date;

public class FormulationMaterial {
	private String type; // e.g., Adjuvants, Preservatives, Stabilizers
	private String manufacturer;
	private Date receivedDate;
	private Date expiryDate;
	private String storageCondition; // e.g., "2-8°C, protected from light"
	private double quantity; // The quantity could be in a specific unit like liters, milligrams, kilograms,
								// etc.

	public FormulationMaterial(String type, String manufacturer, Date receivedDate, Date expiryDate,
			String storageCondition, double quantity) {
		super();
		this.type = type;
		this.manufacturer = manufacturer;
		this.receivedDate = receivedDate;
		this.expiryDate = expiryDate;
		this.storageCondition = storageCondition;
		this.quantity = quantity;
	}

	public FormulationMaterial() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getStorageCondition() {
		return storageCondition;
	}

	public void setStorageCondition(String storageCondition) {
		this.storageCondition = storageCondition;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
