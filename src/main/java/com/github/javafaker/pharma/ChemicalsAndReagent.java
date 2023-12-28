package com.github.javafaker.pharma;

import java.util.Date;

public class ChemicalsAndReagent {
	private String name;
	private String purityGrade;
	private String manufacturer;
	private Date expirationDate;
	private String storageCondition;

	public ChemicalsAndReagent(String name, String purityGrade, String manufacturer, Date expirationDate,
			String storageCondition) {
		super();
		this.name = name;
		this.purityGrade = purityGrade;
		this.manufacturer = manufacturer;
		this.expirationDate = expirationDate;
		this.storageCondition = storageCondition;
	}

	public ChemicalsAndReagent() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurityGrade() {
		return purityGrade;
	}

	public void setPurityGrade(String purityGrade) {
		this.purityGrade = purityGrade;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getStorageCondition() {
		return storageCondition;
	}

	public void setStorageCondition(String storageCondition) {
		this.storageCondition = storageCondition;
	}

}
