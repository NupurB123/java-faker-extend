package com.github.javafaker.pharma;

import java.sql.Date;

public class LaboratoryEquipment {
	private String type; // e.g., Balance, pH Meter
	private String modelNumber;
	private String manufacturer;
	private String status; // e.g., Operational, Under Maintenance
	private String locationName;
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be in days, weeks, months, etc.
	private Date lastMaintenanceDate;

	public LaboratoryEquipment(String type, String modelNumber, String manufacturer, String status, String locationName,
			Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate) {
		super();
		this.type = type;
		this.modelNumber = modelNumber;
		this.manufacturer = manufacturer;
		this.status = status;
		this.locationName = locationName;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
	}

	public LaboratoryEquipment() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
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

}
