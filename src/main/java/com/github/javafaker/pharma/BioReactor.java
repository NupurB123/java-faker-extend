package com.github.javafaker.pharma;

import java.util.Date;

public class BioReactor {
	private String bioreactorName;
	private String bioreactorType;
	private double volumeCapacity; // Assuming volume capacity is a numerical value, e.g., in liters
	private String manufacturer;
	private String modelNumber;
	private String locationName;
	private String locationType;
	private String status; // e.g., In Use, Maintenance, Sterile, Contaminated
	private Date lastCalibrationDate;
	private int calibrationFrequency; // Frequency could be in days, weeks, or months
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, specified in a unit of time
	private String cellLineName;
	private String sourceOrganism;
	private String operationalParameters; // Key-value pairs for operational parameters such as temperature, pH,
											// agitation, etc.

	public BioReactor(String bioreactorName, String bioreactorType, double volumeCapacity, String manufacturer,
			String modelNumber, String locationName, String locationType, String status, Date lastCalibrationDate,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency, String cellLineName,
			String sourceOrganism, String operationalParameters) {
		super();
		this.bioreactorName = bioreactorName;
		this.bioreactorType = bioreactorType;
		this.volumeCapacity = volumeCapacity;
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
		this.locationName = locationName;
		this.locationType = locationType;
		this.status = status;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.cellLineName = cellLineName;
		this.sourceOrganism = sourceOrganism;
		this.operationalParameters = operationalParameters;
	}

	public BioReactor() {
		super();
	}

	public String getBioreactorName() {
		return bioreactorName;
	}

	public void setBioreactorName(String bioreactorName) {
		this.bioreactorName = bioreactorName;
	}

	public String getBioreactorType() {
		return bioreactorType;
	}

	public void setBioreactorType(String bioreactorType) {
		this.bioreactorType = bioreactorType;
	}

	public double getVolumeCapacity() {
		return volumeCapacity;
	}

	public void setVolumeCapacity(double volumeCapacity) {
		this.volumeCapacity = volumeCapacity;
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

	public String getCellLineName() {
		return cellLineName;
	}

	public void setCellLineName(String cellLineName) {
		this.cellLineName = cellLineName;
	}

	public String getSourceOrganism() {
		return sourceOrganism;
	}

	public void setSourceOrganism(String sourceOrganism) {
		this.sourceOrganism = sourceOrganism;
	}

	public String getOperationalParameters() {
		return operationalParameters;
	}

	public void setOperationalParameters(String operationalParameters) {
		this.operationalParameters = operationalParameters;
	}

}
