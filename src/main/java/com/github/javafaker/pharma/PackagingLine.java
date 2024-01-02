package com.github.javafaker.pharma;

import java.util.Date;

public class PackagingLine {
	private String modelSerialNumber;
	private int lineCapacity;
	private String packagingType;
	private String componentCompatibility;
	private String automationLevel;
	private String operationalStatus;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;

	public PackagingLine(String modelSerialNumber, int lineCapacity, String packagingType,
			String componentCompatibility, String automationLevel, String operationalStatus, String locationName,
			String locationType, Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate,
			int maintenanceFrequency) {
		super();
		this.modelSerialNumber = modelSerialNumber;
		this.lineCapacity = lineCapacity;
		this.packagingType = packagingType;
		this.componentCompatibility = componentCompatibility;
		this.automationLevel = automationLevel;
		this.operationalStatus = operationalStatus;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public PackagingLine() {
		super();
	}

	public String getModelSerialNumber() {
		return modelSerialNumber;
	}

	public void setModelSerialNumber(String modelSerialNumber) {
		this.modelSerialNumber = modelSerialNumber;
	}

	public int getLineCapacity() {
		return lineCapacity;
	}

	public void setLineCapacity(int lineCapacity) {
		this.lineCapacity = lineCapacity;
	}

	public String getPackagingType() {
		return packagingType;
	}

	public void setPackagingType(String packagingType) {
		this.packagingType = packagingType;
	}

	public String getComponentCompatibility() {
		return componentCompatibility;
	}

	public void setComponentCompatibility(String componentCompatibility) {
		this.componentCompatibility = componentCompatibility;
	}

	public String getAutomationLevel() {
		return automationLevel;
	}

	public void setAutomationLevel(String automationLevel) {
		this.automationLevel = automationLevel;
	}

	public String getOperationalStatus() {
		return operationalStatus;
	}

	public void setOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
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

}
