package com.github.javafaker.pharma;

public class MonitoringLocation {

	private String locationName;
	private String locationType; // e.g., Cleanroom, Warehouse, Lab
	private String classification; // e.g., ISO Class 5, Class 7, etc.
	private String description;
	
	public MonitoringLocation() {
		super();
	}
	
	public MonitoringLocation(String locationName, String locationType, String classification, String description) {
		super();
		this.locationName = locationName;
		this.locationType = locationType;
		this.classification = classification;
		this.description = description;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
