package com.github.javafaker.pharma;

import java.util.Date;

public class Disperser {
	private String modelSerialNumber;
	private double capacity;
	private double speedControlRange;
	private double powerConsumption;
	private String viscosityRange;
	private String impellerType;
	private String operationalStatus;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;

	public Disperser(String modelSerialNumber, double capacity, double speedControlRange, double powerConsumption,
			String viscosityRange, String impellerType, String operationalStatus, String locationName,
			String locationType, Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate,
			int maintenanceFrequency) {
		super();
		this.modelSerialNumber = modelSerialNumber;
		this.capacity = capacity;
		this.speedControlRange = speedControlRange;
		this.powerConsumption = powerConsumption;
		this.viscosityRange = viscosityRange;
		this.impellerType = impellerType;
		this.operationalStatus = operationalStatus;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public Disperser() {
		super();
	}

	public String getModelSerialNumber() {
		return modelSerialNumber;
	}

	public void setModelSerialNumber(String modelSerialNumber) {
		this.modelSerialNumber = modelSerialNumber;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getSpeedControlRange() {
		return speedControlRange;
	}

	public void setSpeedControlRange(double speedControlRange) {
		this.speedControlRange = speedControlRange;
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getViscosityRange() {
		return viscosityRange;
	}

	public void setViscosityRange(String viscosityRange) {
		this.viscosityRange = viscosityRange;
	}

	public String getImpellerType() {
		return impellerType;
	}

	public void setImpellerType(String impellerType) {
		this.impellerType = impellerType;
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
