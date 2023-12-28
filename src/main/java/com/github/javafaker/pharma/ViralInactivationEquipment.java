package com.github.javafaker.pharma;

import java.util.Date;

public class ViralInactivationEquipment {
	private String equipmentName;
	private String inactivationMethod; // e.g., Low pH, Solvent/Detergent
	private String manufacturer;
	private String modelNumber;
	private String locationName;
	private String locationType;
	private String status; // In Use, Maintenance
	private Date lastCalibrationDate;
	private int calibrationFrequency; // Numerical value, typically in days
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Numerical value, typically in days
	private String operationalParameters; // Key-value pairs representing operational parameters

	public ViralInactivationEquipment(String equipmentName, String inactivationMethod, String manufacturer,
			String modelNumber, String locationName, String locationType, String status, Date lastCalibrationDate,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency,
			String operationalParameters) {
		super();
		this.equipmentName = equipmentName;
		this.inactivationMethod = inactivationMethod;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.locationName = locationName;
		this.locationType = locationType;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.operationalParameters = operationalParameters;
	}

	public ViralInactivationEquipment() {
		super();
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getInactivationMethod() {
		return inactivationMethod;
	}

	public void setInactivationMethod(String inactivationMethod) {
		this.inactivationMethod = inactivationMethod;
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

	public String getOperationalParameters() {
		return operationalParameters;
	}

	public void setOperationalParameters(String operationalParameters) {
		this.operationalParameters = operationalParameters;
	}

}
