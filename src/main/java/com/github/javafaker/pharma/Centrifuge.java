package com.github.javafaker.pharma;

import java.util.Date;

public class Centrifuge {
	private int maximumSpeed;
	private double capacity;
	private String temperatureControlRange;
	private String rotorTypes;
	private String safetyFeatures;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;
	private String status;

	public Centrifuge(int maximumSpeed, double capacity, String temperatureControlRange, String rotorTypes,
			String safetyFeatures, String locationName, String locationType, Date lastCalibrationDate,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency, String status) {
		super();
		this.maximumSpeed = maximumSpeed;
		this.capacity = capacity;
		this.temperatureControlRange = temperatureControlRange;
		this.rotorTypes = rotorTypes;
		this.safetyFeatures = safetyFeatures;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.status = status;
	}

	public Centrifuge() {
		super();
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getTemperatureControlRange() {
		return temperatureControlRange;
	}

	public void setTemperatureControlRange(String temperatureControlRange) {
		this.temperatureControlRange = temperatureControlRange;
	}

	public String getRotorTypes() {
		return rotorTypes;
	}

	public void setRotorTypes(String rotorTypes) {
		this.rotorTypes = rotorTypes;
	}

	public String getSafetyFeatures() {
		return safetyFeatures;
	}

	public void setSafetyFeatures(String safetyFeatures) {
		this.safetyFeatures = safetyFeatures;
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
