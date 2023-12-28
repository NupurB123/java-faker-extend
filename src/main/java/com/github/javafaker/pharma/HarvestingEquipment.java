package com.github.javafaker.pharma;

import java.util.Date;

public class HarvestingEquipment {
	private String equipmentName;
	private String equipmentType; // e.g., Centrifuge, Microfiltration Unit
	private String manufacturer;
	private String modelNumber;
	private String status; // e.g., In Use, Maintenance, Sterile
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be in days, weeks, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, weeks, months, etc.
	private String locationName;
	private String locationType;
	private String operationalParameters; // Key-value pairs representing various operational parameters

	public HarvestingEquipment(String equipmentName, String equipmentType, String manufacturer, String modelNumber,
			String status, Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate,
			int maintenanceFrequency, String locationName, String locationType, String operationalParameters) {
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
		this.locationName = locationName;
		this.locationType = locationType;
		this.operationalParameters = operationalParameters;
	}

	public HarvestingEquipment() {
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

	public String getOperationalParameters() {
		return operationalParameters;
	}

	public void setOperationalParameters(String operationalParameters) {
		this.operationalParameters = operationalParameters;
	}

}
