package com.github.javafaker.pharma;

public class LaboratoryLocation {
	private String locationName;
	private String locationType; // e.g., Preparation Area, Storage Area

	public LaboratoryLocation(String locationName, String locationType) {
		super();
		this.locationName = locationName;
		this.locationType = locationType;
	}

	public LaboratoryLocation() {
		super();
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

}
