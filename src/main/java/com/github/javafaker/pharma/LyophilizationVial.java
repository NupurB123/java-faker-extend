package com.github.javafaker.pharma;

import java.sql.Date;

public class LyophilizationVial {
	private String vialType;
	private double volumeCapacity;
	private String manufacturer;
	private Date sterilizationDate;
	private Date expiryDate;

	public LyophilizationVial(String vialType, double volumeCapacity, String manufacturer, Date sterilizationDate,
			Date expiryDate) {
		super();
		this.vialType = vialType;
		this.volumeCapacity = volumeCapacity;
		this.manufacturer = manufacturer;
		this.sterilizationDate = sterilizationDate;
		this.expiryDate = expiryDate;
	}

	public LyophilizationVial() {
		super();
	}

	public String getVialType() {
		return vialType;
	}

	public void setVialType(String vialType) {
		this.vialType = vialType;
	}

	public double getVolumeCapacity() {
		return volumeCapacity;
	}

	public void setVolumeCapacity(double volumeCapacity) {
		this.volumeCapacity = volumeCapacity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getSterilizationDate() {
		return sterilizationDate;
	}

	public void setSterilizationDate(Date sterilizationDate) {
		this.sterilizationDate = sterilizationDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
