package com.github.javafaker.pharma;

import java.sql.Date;

public class InspectionEquipment {
	private String manufacturer;
	private String modelNumber;
	private String inspectionType; // e.g., Visual, Weight Check
	private String status; // e.g., Operational, Under Maintenance
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be in days, weeks, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, weeks, months, etc.

	public InspectionEquipment(String manufacturer, String modelNumber, String inspectionType, String status,
			Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.inspectionType = inspectionType;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public InspectionEquipment() {
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

	public String getInspectionType() {
		return inspectionType;
	}

	public void setInspectionType(String inspectionType) {
		this.inspectionType = inspectionType;
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
