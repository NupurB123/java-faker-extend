package com.github.javafaker.pharma;

import java.util.Date;

public class FormulationEquipment {
	private String type; // e.g., Mixer, Homogenizer
	private String manufacturer;
	private String modelNumber;
	private String capacity; // A string that can represent units like liters, kilograms, etc.
	private String status; // e.g., Operational, Under Maintenance
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be indicated in days, weeks, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, weeks, months, etc.

	public FormulationEquipment(String type, String manufacturer, String modelNumber, String capacity, String status,
			Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.type = type;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.capacity = capacity;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public FormulationEquipment() {
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
