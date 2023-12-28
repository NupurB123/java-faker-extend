package com.github.javafaker.pharma;

import java.util.Date;

public class Equipment {
	private String equipmentType; // e.g., Incubator, Particle Counter, TOC Analyzer
	private String modelNumber;
	private String serialNumber;
	private String manufacturer;
	private Date lastCalibrationDate;
	private int calibrationFrequency; // in days, weeks, months, etc., depending on your specific application
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // similarly, in days, weeks, months, etc.
	private String locationName;
	private String locationType;
	private String status; // e.g., Active, In Maintenance

	public Equipment() {
		super();
	}

	public Equipment(String equipmentType, String modelNumber, String serialNumber, String manufacturer,
			Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency,
			String locationName, String locationType, String status) {
		super();
		this.equipmentType = equipmentType;
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.locationName = locationName;
		this.locationType = locationType;
		this.status = status;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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
