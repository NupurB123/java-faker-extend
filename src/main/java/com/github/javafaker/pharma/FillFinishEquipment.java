package com.github.javafaker.pharma;

import java.util.Date;

public class FillFinishEquipment {
	private String equipmentName;
	private String equipmentType; // e.g., Aseptic Filler, Lyophilizer
	private String manufacturer;
	private String modelNumber;
	private String status; // In Use, Maintenance, etc.
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be in days, weeks, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, weeks, etc.

	public FillFinishEquipment(String equipmentName, String equipmentType, String manufacturer, String modelNumber,
			String status, Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate,
			int maintenanceFrequency) {
		super();
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public FillFinishEquipment() {
		super();
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
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
