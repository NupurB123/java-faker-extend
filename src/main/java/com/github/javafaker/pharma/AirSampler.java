package com.github.javafaker.pharma;

import java.util.Date;

public class AirSampler {
	private String samplerType; // e.g., Impactor, Centrifugal, Sieve
	private String modelNumber;
	private String serialNumber;
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be in days, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency in days, months, etc.
	private String locationName;
	private String locationType;
	private String status; // e.g., Active, In Maintenance

	public AirSampler() {
		super();
	}

	public AirSampler(String samplerType, String modelNumber, String serialNumber, Date lastCalibrationDate,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency, String locationName,
			String locationType, String status) {
		super();
		this.samplerType = samplerType;
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.locationName = locationName;
		this.locationType = locationType;
		this.status = status;
	}

	public String getSamplerType() {
		return samplerType;
	}

	public void setSamplerType(String samplerType) {
		this.samplerType = samplerType;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getLastCalibrationDate() {
		return lastCalibrationDate;
	}

	public void setLastCalibrationDate(Date lastCalibrationDate) {
		this.lastCalibrationDate = lastCalibrationDate;
	}

	public int getCalibrationFrequency() {
		return calibrationFrequency;
	}

	public void setCalibrationFrequency(int calibrationFrequency) {
		this.calibrationFrequency = calibrationFrequency;
	}

	public Date getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}

	public void setLastMaintenanceDate(Date lastMaintenanceDate) {
		this.lastMaintenanceDate = lastMaintenanceDate;
	}

	public int getMaintenanceFrequency() {
		return maintenanceFrequency;
	}

	public void setMaintenanceFrequency(int maintenanceFrequency) {
		this.maintenanceFrequency = maintenanceFrequency;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
