package com.github.javafaker.pharma;

import java.sql.Date;

public class Sensor {

	private String sensorType; // e.g., Particle Counter, Temperature Sensor
	private String modelNumber;
	private String serialNumber;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be in days, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency in days, months, etc.
	private String status; // e.g., Active, In Maintenance

	public Sensor() {
		super();
	}

	public Sensor(String sensorType, String modelNumber, String serialNumber, String locationName, String locationType,
			Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency,
			String status) {
		super();
		this.sensorType = sensorType;
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.status = status;
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

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
