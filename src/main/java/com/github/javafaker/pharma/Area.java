package com.github.javafaker.pharma;

public class Area {
	private String name;
	private String facilityName;
	private String classification;
	private String purpose;
	private String accessRestrictions;

	public Area(String name, String facilityName, String classification, String purpose, String accessRestrictions) {
		super();
		this.name = name;
		this.facilityName = facilityName;
		this.classification = classification;
		this.purpose = purpose;
		this.accessRestrictions = accessRestrictions;
	}

	public Area() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getAccessRestrictions() {
		return accessRestrictions;
	}

	public void setAccessRestrictions(String accessRestrictions) {
		this.accessRestrictions = accessRestrictions;
	}

}
