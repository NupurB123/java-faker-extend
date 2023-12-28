package com.github.javafaker.pharma;

public class SamplingSurface {
	private String surfaceType; // e.g., Stainless Steel, Glass, Plastic
	private String locationName;
	private String locationType;
	private String description;

	public SamplingSurface() {
		super();
	}

	public SamplingSurface(String surfaceType, String locationName, String locationType, String description) {
		super();
		this.surfaceType = surfaceType;
		this.locationName = locationName;
		this.locationType = locationType;
		this.description = description;
	}

	public String getSurfaceType() {
		return surfaceType;
	}

	public void setSurfaceType(String surfaceType) {
		this.surfaceType = surfaceType;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
