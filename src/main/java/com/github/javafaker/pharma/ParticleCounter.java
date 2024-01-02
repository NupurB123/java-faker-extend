package com.github.javafaker.pharma;

import java.util.Date;

public class ParticleCounter {
	private String particleSizeRange;
	private String flowRate;
	private String samplingRate;
	private String communicationProtocol;

	private String locationName;
	private String locationType;
	private Date lastCalibrationDate;
	private int calibrationFrequency;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency;

	public ParticleCounter(String particleSizeRange, String flowRate, String samplingRate, String communicationProtocol,
			String locationName, String locationType, Date lastCalibrationDate, int calibrationFrequency,
			Date lastMaintenanceDate, int maintenanceFrequency) {
		super();
		this.particleSizeRange = particleSizeRange;
		this.flowRate = flowRate;
		this.samplingRate = samplingRate;
		this.communicationProtocol = communicationProtocol;
		this.locationName = locationName;
		this.locationType = locationType;
		this.lastCalibrationDate = lastCalibrationDate;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public ParticleCounter() {
		super();
	}

	public String getParticleSizeRange() {
		return particleSizeRange;
	}

	public void setParticleSizeRange(String particleSizeRange) {
		this.particleSizeRange = particleSizeRange;
	}

	public String getFlowRate() {
		return flowRate;
	}

	public void setFlowRate(String flowRate) {
		this.flowRate = flowRate;
	}

	public String getSamplingRate() {
		return samplingRate;
	}

	public void setSamplingRate(String samplingRate) {
		this.samplingRate = samplingRate;
	}

	public String getCommunicationProtocol() {
		return communicationProtocol;
	}

	public void setCommunicationProtocol(String communicationProtocol) {
		this.communicationProtocol = communicationProtocol;
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
