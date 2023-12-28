package com.github.javafaker.pharma;

import java.sql.Date;

public class Incubator {

	private String incubatorType; // e.g., CO2 Incubator, Refrigerated Incubator
	private String manufacturer;
	private String modelNumber;
	private int calibrationFrequency; // The frequency might be indicated in days, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, months, etc.
	private Date lastCalibrationDate;
	private String locationName;
	private String locationType;
	private String status; // e.g., Active, In Maintenance

	public Incubator() {
		super();
	}

	public Incubator(String incubatorType, String manufacturer, String modelNumber, int calibrationFrequency,
			Date lastCalibrationDate, Date lastMaintenanceDate, int maintenanceFrequency, String locationName,
			String locationType, String status) {
		super();
		this.incubatorType = incubatorType;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.calibrationFrequency = calibrationFrequency;
		this.lastCalibrationDate = lastCalibrationDate;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.locationName = locationName;
		this.locationType = locationType;
		this.status = status;
	}

	public Date getLastCalibrationDate() {
		return lastCalibrationDate;
	}

	public void setLastCalibrationDate(Date lastCalibrationDate) {
		this.lastCalibrationDate = lastCalibrationDate;
	}

	public String getIncubatorType() {
		return incubatorType;
	}

	public void setIncubatorType(String incubatorType) {
		this.incubatorType = incubatorType;
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
