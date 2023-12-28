package com.github.javafaker.pharma;

import java.util.Date;

public class PurificationEquipment {
	private String type; // e.g., Chromatography System, Filtration Unit
	private String manufacturer;
	private String modelNumber;
	private String capacity; // This could be in liters, throughput volume, or other units as appropriate
	private Date installationDate;
	private String status; // e.g., Operational, Maintenance Due, Decommissioned
	private Date lastCalibrationDate;
	private int calibrationFrequency; // Expected in days, unless other units are standard for your company
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, months, etc.

	public PurificationEquipment(String type, String manufacturer, String modelNumber, String capacity,
			Date installationDate, String status, Date lastCalibrationDate, int calibrationFrequency,
			Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.type = type;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.capacity = capacity;
		this.installationDate = installationDate;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public PurificationEquipment() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public Date getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
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

}
