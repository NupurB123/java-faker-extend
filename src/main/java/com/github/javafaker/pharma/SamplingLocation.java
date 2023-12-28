package com.github.javafaker.pharma;

public class SamplingLocation {
	private String locationName;
	private String locationType; // e.g., Cleanroom, Warehouse, Lab
	private String locationClassification; // e.g., ISO Class 5, Class 7, etc.
	private String description;

	public SamplingLocation() {
		super();
	}

	public SamplingLocation(String locationName, String locationType, String locationClassification,
			String description) {
		super();
		this.locationName = locationName;
		this.locationType = locationType;
		this.locationClassification = locationClassification;
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

	public String getLocationClassification() {
		return locationClassification;
	}

	public void setLocationClassification(String locationClassification) {
		this.locationClassification = locationClassification;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
