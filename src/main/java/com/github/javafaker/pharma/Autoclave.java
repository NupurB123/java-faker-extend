package com.github.javafaker.pharma;

import java.util.Date;

public class Autoclave {
	private String chamberSize;
	private String temperatureRange;
	private String pressureRange;
	private String cycleTypes;
	private String validationFeatures;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;
	private String status;

	public Autoclave(String chamberSize, String temperatureRange, String pressureRange, String cycleTypes,
			String validationFeatures, String locationName, String locationType, Date lastCalibrationDate,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency, String status) {
		super();
		this.chamberSize = chamberSize;
		this.temperatureRange = temperatureRange;
		this.pressureRange = pressureRange;
		this.cycleTypes = cycleTypes;
		this.validationFeatures = validationFeatures;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.status = status;
	}

	public Autoclave() {
		super();
	}

	public String getChamberSize() {
		return chamberSize;
	}

	public void setChamberSize(String chamberSize) {
		this.chamberSize = chamberSize;
	}

	public String getTemperatureRange() {
		return temperatureRange;
	}

	public void setTemperatureRange(String temperatureRange) {
		this.temperatureRange = temperatureRange;
	}

	public String getPressureRange() {
		return pressureRange;
	}

	public void setPressureRange(String pressureRange) {
		this.pressureRange = pressureRange;
	}

	public String getCycleTypes() {
		return cycleTypes;
	}

	public void setCycleTypes(String cycleTypes) {
		this.cycleTypes = cycleTypes;
	}

	public String getValidationFeatures() {
		return validationFeatures;
	}

	public void setValidationFeatures(String validationFeatures) {
		this.validationFeatures = validationFeatures;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
