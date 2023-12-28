package com.github.javafaker.pharma;

import java.sql.Date;

public class ProtectiveEquipment {
	private String equipmentName;
	private String type;
	private String manufacturer;
	private Date expiryDate;

	public ProtectiveEquipment(String equipmentName, String type, String manufacturer, Date expiryDate) {
		super();
		this.equipmentName = equipmentName;
		this.type = type;
		this.manufacturer = manufacturer;
		this.expiryDate = expiryDate;
	}

	public ProtectiveEquipment() {
		super();
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
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

}
