package com.github.javafaker.pharma;

import java.util.Date;

public class RawMaterial {
	private String materialName;
	private String manufacturer;
	private Date receivedDate;
	private Date expiryDate;
	private String qcStatus; // e.g., Quarantine, Approved, Rejected

	public RawMaterial(String materialName, String manufacturer, Date receivedDate, Date expiryDate, String qcStatus) {
		super();
		this.materialName = materialName;
		this.manufacturer = manufacturer;
		this.receivedDate = receivedDate;
		this.expiryDate = expiryDate;
		this.qcStatus = qcStatus;
	}

	public RawMaterial() {
		super();
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
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

	public String getQcStatus() {
		return qcStatus;
	}

	public void setQcStatus(String qcStatus) {
		this.qcStatus = qcStatus;
	}

}
