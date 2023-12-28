package com.github.javafaker.pharma;

public class GasSamplingPoint {
	private String gasSystemName;
	private String gasSystemType; // e.g., Compressed Air, Nitrogen, CO2
	private String pointName;
	private String locationDescription;
	private int samplingFrequency; // Typically indicated in days, weeks, months, etc.
	private String samplingMethod; // Description of the sampling procedure

	public GasSamplingPoint(String gasSystemName, String gasSystemType, String pointName, String locationDescription,
			int samplingFrequency, String samplingMethod) {
		super();
		this.gasSystemName = gasSystemName;
		this.gasSystemType = gasSystemType;
		this.pointName = pointName;
		this.locationDescription = locationDescription;
		this.samplingFrequency = samplingFrequency;
		this.samplingMethod = samplingMethod;
	}

	public GasSamplingPoint() {
		super();
	}

	public String getGasSystemName() {
		return gasSystemName;
	}

	public void setGasSystemName(String gasSystemName) {
		this.gasSystemName = gasSystemName;
	}

	public String getGasSystemType() {
		return gasSystemType;
	}

	public void setGasSystemType(String gasSystemType) {
		this.gasSystemType = gasSystemType;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public int getSamplingFrequency() {
		return samplingFrequency;
	}

	public void setSamplingFrequency(int samplingFrequency) {
		this.samplingFrequency = samplingFrequency;
	}

	public String getSamplingMethod() {
		return samplingMethod;
	}

	public void setSamplingMethod(String samplingMethod) {
		this.samplingMethod = samplingMethod;
	}

}
