package com.github.javafaker.pharma;

import java.util.Date;

public class FiltrationSystem {
	private String type; // e.g., Microfiltration, Ultrafiltration
	private String manufacturer;
	private String modelNumber;
	private String membraneSpecs; // Describes specifics about the membrane used, e.g., pore size, material
	private Date installationDate;
	private String status; // e.g., Operational, Under Maintenance
	private Date lastCalibrationDate;
	private int calibrationFrequency; // The frequency in days, weeks, or months
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency in days, weeks, or months

	public FiltrationSystem(String type, String manufacturer, String modelNumber, String membraneSpecs,
			Date installationDate, String status, Date lastCalibrationDate, int calibrationFrequency,
			Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.type = type;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.membraneSpecs = membraneSpecs;
		this.installationDate = installationDate;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public FiltrationSystem() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getMembraneSpecs() {
		return membraneSpecs;
	}

	public void setMembraneSpecs(String membraneSpecs) {
		this.membraneSpecs = membraneSpecs;
	}

	public Date getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
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

}
