package com.github.javafaker.pharma;

import java.util.Date;

public class PurificationConsumable {
	private String consumableName;
	private String type; // e.g., Resin, Filter, Solvent, Buffer
	private String manufacturer;
	private Date expiryDate;
	private String associatedProcessName; // The name of the process with which the consumable is associated

	public PurificationConsumable(String consumableName, String type, String manufacturer, Date expiryDate,
			String associatedProcessName) {
		super();
		this.consumableName = consumableName;
		this.type = type;
		this.manufacturer = manufacturer;
		this.expiryDate = expiryDate;
		this.associatedProcessName = associatedProcessName;
	}

	public PurificationConsumable() {
		super();
	}

	public String getConsumableName() {
		return consumableName;
	}

	public void setConsumableName(String consumableName) {
		this.consumableName = consumableName;
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

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getAssociatedProcessName() {
		return associatedProcessName;
	}

	public void setAssociatedProcessName(String associatedProcessName) {
		this.associatedProcessName = associatedProcessName;
	}

}
