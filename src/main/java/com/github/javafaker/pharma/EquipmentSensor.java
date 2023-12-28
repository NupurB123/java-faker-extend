package com.github.javafaker.pharma;

import java.util.Date;

public class EquipmentSensor {
	private String sensorType; // pH, temperature, DO, etc.
	private String modelNumber;
	private String manufacturer;
	private String status; // Active, Inactive, Maintenance, etc.
	private Date lastCalibrationDate;
	private int calibrationFrequency; // Frequency could be in days, weeks, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Likewise, specified in a unit of time
	private String operationalRange; // Could be a range like "0-14 pH", "0-100°C", "0-100% DO", etc.
	private String locationName;
	private String locationType;
	private String accuracy; // Could be a numerical tolerance or a percentage, e.g., "±0.01 pH", "±0.1°C",
								// "±2% DO"

	public EquipmentSensor(String sensorType, String modelNumber, String manufacturer, String status,
			Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency,
			String operationalRange, String locationName, String locationType, String accuracy) {
		super();
		this.sensorType = sensorType;
		this.modelNumber = modelNumber;
		this.manufacturer = manufacturer;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.operationalRange = operationalRange;
		this.locationName = locationName;
		this.locationType = locationType;
		this.accuracy = accuracy;
	}

	public EquipmentSensor() {
		super();
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getOperationalRange() {
		return operationalRange;
	}

	public void setOperationalRange(String operationalRange) {
		this.operationalRange = operationalRange;
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

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

}
