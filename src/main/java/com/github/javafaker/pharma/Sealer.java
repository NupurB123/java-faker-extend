package com.github.javafaker.pharma;

import java.util.Date;

public class Sealer {
	private String modelSerialNumber;
	private int sealingSpeed;
	private String sealType;
	private double sealWidth;
	private String materialCompatibility;
	private boolean temperatureControl;
	private double sealingPressureRange;
	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;
	private String operationalStatus;

	public Sealer(String modelSerialNumber, int sealingSpeed, String sealType, double sealWidth,
			String materialCompatibility, boolean temperatureControl, double sealingPressureRange, String locationName,
			String locationType, Date lastCalibrationDate, int calibrationFrequency, Date lastMaintenanceDate,
			int maintenanceFrequency, String operationalStatus) {
		super();
		this.modelSerialNumber = modelSerialNumber;
		this.sealingSpeed = sealingSpeed;
		this.sealType = sealType;
		this.sealWidth = sealWidth;
		this.materialCompatibility = materialCompatibility;
		this.temperatureControl = temperatureControl;
		this.sealingPressureRange = sealingPressureRange;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.operationalStatus = operationalStatus;
	}

	public Sealer() {
		super();
	}

	public String getModelSerialNumber() {
		return modelSerialNumber;
	}

	public void setModelSerialNumber(String modelSerialNumber) {
		this.modelSerialNumber = modelSerialNumber;
	}

	public int getSealingSpeed() {
		return sealingSpeed;
	}

	public void setSealingSpeed(int sealingSpeed) {
		this.sealingSpeed = sealingSpeed;
	}

	public String getSealType() {
		return sealType;
	}

	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public double getSealWidth() {
		return sealWidth;
	}

	public void setSealWidth(double sealWidth) {
		this.sealWidth = sealWidth;
	}

	public String getMaterialCompatibility() {
		return materialCompatibility;
	}

	public void setMaterialCompatibility(String materialCompatibility) {
		this.materialCompatibility = materialCompatibility;
	}

	public boolean isTemperatureControl() {
		return temperatureControl;
	}

	public void setTemperatureControl(boolean temperatureControl) {
		this.temperatureControl = temperatureControl;
	}

	public double getSealingPressureRange() {
		return sealingPressureRange;
	}

	public void setSealingPressureRange(double sealingPressureRange) {
		this.sealingPressureRange = sealingPressureRange;
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

	public String getOperationalStatus() {
		return operationalStatus;
	}

	public void setOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
	}

}
