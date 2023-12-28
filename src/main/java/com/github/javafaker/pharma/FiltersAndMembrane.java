package com.github.javafaker.pharma;

public class FiltersAndMembrane {
	private String filterType; // e.g., Normal Flow, Tangential Flow, Virus Removal
	private double poreSize; // Numerical value for pore size, usually in micrometers (µm)
	private double surfaceArea; // Numerical value for surface area, possibly in square meters (m²)
	private String manufacturer;
	private String modelNumber;
	private Number usageLimit; // Typically an integer representing the maximum number of use cycles or
							// volumetric limit
	private String status; // e.g., Sterilized, Used
	private String associatedProcessName; // The name of the process with which the filter or membrane is associated

	public FiltersAndMembrane(String filterType, double poreSize, double surfaceArea, String manufacturer,
			String modelNumber, int usageLimit, String status, String associatedProcessName) {
		super();
		this.filterType = filterType;
		this.poreSize = poreSize;
		this.surfaceArea = surfaceArea;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.usageLimit = usageLimit;
		this.status = status;
		this.associatedProcessName = associatedProcessName;
	}

	public FiltersAndMembrane() {
		super();
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public double getPoreSize() {
		return poreSize;
	}

	public void setPoreSize(double poreSize) {
		this.poreSize = poreSize;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Number getUsageLimit() {
		return usageLimit;
	}

	public void setUsageLimit(int usageLimit) {
		this.usageLimit = usageLimit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssociatedProcessName() {
		return associatedProcessName;
	}

	public void setAssociatedProcessName(String associatedProcessName) {
		this.associatedProcessName = associatedProcessName;
	}

}
