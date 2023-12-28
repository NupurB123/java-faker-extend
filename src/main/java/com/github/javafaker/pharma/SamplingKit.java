package com.github.javafaker.pharma;

import java.sql.Date;

public class SamplingKit {
	private String kitType; // e.g., Glove Fingertip Samplers, Garment Samplers
	private String manufacturer;
	private Date expiryDate;

	public SamplingKit(String kitType, String manufacturer, Date expiryDate) {
		super();
		this.kitType = kitType;
		this.manufacturer = manufacturer;
		this.expiryDate = expiryDate;
	}

	public SamplingKit() {
		super();
	}

	public String getKitType() {
		return kitType;
	}

	public void setKitType(String kitType) {
		this.kitType = kitType;
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
