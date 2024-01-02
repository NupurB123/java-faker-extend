package com.github.javafaker.pharma;

import java.util.Date;

public class CompressionPress {
	private String modelSerialNumber;
	private double maxTabletDiameter;
	private double maxCompressionForce;
	private double turretSpeed;
	private int numberOfStations;
	private int outputCapacity;
	private String controlSystemType;
	private String locationPlant;
	private String operationalStatus;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;

	public CompressionPress(String modelSerialNumber, double maxTabletDiameter, double maxCompressionForce,
			double turretSpeed, int numberOfStations, int outputCapacity, String controlSystemType,
			String locationPlant, String operationalStatus, String locationName, String locationType,
			Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.modelSerialNumber = modelSerialNumber;
		this.maxTabletDiameter = maxTabletDiameter;
		this.maxCompressionForce = maxCompressionForce;
		this.turretSpeed = turretSpeed;
		this.numberOfStations = numberOfStations;
		this.outputCapacity = outputCapacity;
		this.controlSystemType = controlSystemType;
		this.locationPlant = locationPlant;
		this.operationalStatus = operationalStatus;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public CompressionPress() {
		super();
	}

	public String getModelSerialNumber() {
		return modelSerialNumber;
	}

	public void setModelSerialNumber(String modelSerialNumber) {
		this.modelSerialNumber = modelSerialNumber;
	}

	public double getMaxTabletDiameter() {
		return maxTabletDiameter;
	}

	public void setMaxTabletDiameter(double maxTabletDiameter) {
		this.maxTabletDiameter = maxTabletDiameter;
	}

	public double getMaxCompressionForce() {
		return maxCompressionForce;
	}

	public void setMaxCompressionForce(double maxCompressionForce) {
		this.maxCompressionForce = maxCompressionForce;
	}

	public double getTurretSpeed() {
		return turretSpeed;
	}

	public void setTurretSpeed(double turretSpeed) {
		this.turretSpeed = turretSpeed;
	}

	public int getNumberOfStations() {
		return numberOfStations;
	}

	public void setNumberOfStations(int numberOfStations) {
		this.numberOfStations = numberOfStations;
	}

	public int getOutputCapacity() {
		return outputCapacity;
	}

	public void setOutputCapacity(int outputCapacity) {
		this.outputCapacity = outputCapacity;
	}

	public String getControlSystemType() {
		return controlSystemType;
	}

	public void setControlSystemType(String controlSystemType) {
		this.controlSystemType = controlSystemType;
	}

	public String getLocationPlant() {
		return locationPlant;
	}

	public void setLocationPlant(String locationPlant) {
		this.locationPlant = locationPlant;
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
