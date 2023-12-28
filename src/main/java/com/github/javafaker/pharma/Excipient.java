package com.github.javafaker.pharma;

import java.util.Date;

public class Excipient {
	private String name;
	private String type; // e.g., Adjuvant, Preservative, Stabilizer
	private String manufacturer;
	private String standardConcentration; // Could be "5 mg/mL" or "10% w/v", etc.
	private Date expiryDate;
	private String storageCondition; // e.g., "Store at 2-8°C", "Protect from light"

	public Excipient(String name, String type, String manufacturer, String standardConcentration, Date expiryDate,
			String storageCondition) {
		super();
		this.name = name;
		this.type = type;
		this.manufacturer = manufacturer;
		this.standardConcentration = standardConcentration;
		this.expiryDate = expiryDate;
		this.storageCondition = storageCondition;
	}

	public Excipient() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getStandardConcentration() {
		return standardConcentration;
	}

	public void setStandardConcentration(String standardConcentration) {
		this.standardConcentration = standardConcentration;
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

}
