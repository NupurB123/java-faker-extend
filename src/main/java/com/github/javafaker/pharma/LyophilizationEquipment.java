package com.github.javafaker.pharma;

import java.sql.Date;

public class LyophilizationEquipment {
	private String manufacturer;
	private String modelNumber;
	private String capacity; // This could represent the maximum volume that can be processed
	private String shelfArea; // Area in square meters (or other appropriate units)
	private String condenserTempRange; // e.g., "-80°C to -50°C"
	private String vacuumRange; // e.g., "10 Pa to 1 Pa"
	private String status; // e.g., Operational, Under Maintenance
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be indicated in days, weeks, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, weeks, months, etc.

	public LyophilizationEquipment(String manufacturer, String modelNumber, String capacity, String shelfArea,
			String condenserTempRange, String vacuumRange, String status, Date lastCalibrationDate,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.capacity = capacity;
		this.shelfArea = shelfArea;
		this.condenserTempRange = condenserTempRange;
		this.vacuumRange = vacuumRange;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public LyophilizationEquipment() {
		super();
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

	public String getShelfArea() {
		return shelfArea;
	}

	public void setShelfArea(String shelfArea) {
		this.shelfArea = shelfArea;
	}

	public String getCondenserTempRange() {
		return condenserTempRange;
	}

	public void setCondenserTempRange(String condenserTempRange) {
		this.condenserTempRange = condenserTempRange;
	}

	public String getVacuumRange() {
		return vacuumRange;
	}

	public void setVacuumRange(String vacuumRange) {
		this.vacuumRange = vacuumRange;
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
