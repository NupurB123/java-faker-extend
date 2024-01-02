package com.github.javafaker.pharma;

import java.util.Date;

public class Capper {
	private String modelSerialNumber;
	private int cappingSpeed;
	private String capTypeCompatibility;
	private String containerCompatibility;
	private double torqueControlRange;
	private String changeoverFlexibility;
	private String operationalStatus;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;

	public Capper(String modelSerialNumber, int cappingSpeed, String capTypeCompatibility,
			String containerCompatibility, double torqueControlRange, String changeoverFlexibility,
			String operationalStatus, String locationName, String locationType, Date lastCalibrationDate,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.modelSerialNumber = modelSerialNumber;
		this.cappingSpeed = cappingSpeed;
		this.capTypeCompatibility = capTypeCompatibility;
		this.containerCompatibility = containerCompatibility;
		this.torqueControlRange = torqueControlRange;
		this.changeoverFlexibility = changeoverFlexibility;
		this.operationalStatus = operationalStatus;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public Capper() {
		super();
	}

	public String getModelSerialNumber() {
		return modelSerialNumber;
	}

	public void setModelSerialNumber(String modelSerialNumber) {
		this.modelSerialNumber = modelSerialNumber;
	}

	public int getCappingSpeed() {
		return cappingSpeed;
	}

	public void setCappingSpeed(int cappingSpeed) {
		this.cappingSpeed = cappingSpeed;
	}

	public String getCapTypeCompatibility() {
		return capTypeCompatibility;
	}

	public void setCapTypeCompatibility(String capTypeCompatibility) {
		this.capTypeCompatibility = capTypeCompatibility;
	}

	public String getContainerCompatibility() {
		return containerCompatibility;
	}

	public void setContainerCompatibility(String containerCompatibility) {
		this.containerCompatibility = containerCompatibility;
	}

	public double getTorqueControlRange() {
		return torqueControlRange;
	}

	public void setTorqueControlRange(double torqueControlRange) {
		this.torqueControlRange = torqueControlRange;
	}

	public String getChangeoverFlexibility() {
		return changeoverFlexibility;
	}

	public void setChangeoverFlexibility(String changeoverFlexibility) {
		this.changeoverFlexibility = changeoverFlexibility;
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
