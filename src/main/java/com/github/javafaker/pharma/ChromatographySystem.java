package com.github.javafaker.pharma;

import java.util.Date;

public class ChromatographySystem {
	private String systemName;
	private String systemType; // e.g., Affinity, Ion Exchange, Size Exclusion
	private String manufacturer;
	private String modelNumber;
	private String columnType;
	private String resinType;
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency could be indicated in days, weeks, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, weeks, months, etc.
	private String locationName;
	private String locationType;

	public ChromatographySystem(String systemName, String systemType, String manufacturer, String modelNumber,
			String columnType, String resinType, Date lastCalibrationDate, int calibrationFrequency,
			Date lastMaintenanceDate, int maintenanceFrequency, String locationName, String locationType) {
		super();
		this.systemName = systemName;
		this.systemType = systemType;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.columnType = columnType;
		this.resinType = resinType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.locationName = locationName;
		this.locationType = locationType;
	}

	public ChromatographySystem() {
		super();
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
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

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getResinType() {
		return resinType;
	}

	public void setResinType(String resinType) {
		this.resinType = resinType;
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

}
