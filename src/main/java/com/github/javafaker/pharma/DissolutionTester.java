package com.github.javafaker.pharma;

public class DissolutionTester {
	private int testStations;
	private double speedRange;
	private double temperatureRange;
	private double mediaVolumeRange;
	private boolean samplingAutomation;
	private String operationalStatus;

	public int getTestStations() {
		return testStations;
	}

	public void setTestStations(int testStations) {
		this.testStations = testStations;
	}

	public double getSpeedRange() {
		return speedRange;
	}

	public void setSpeedRange(double speedRange) {
		this.speedRange = speedRange;
	}

	public double getTemperatureRange() {
		return temperatureRange;
	}

	public void setTemperatureRange(double temperatureRange) {
		this.temperatureRange = temperatureRange;
	}

	public double getMediaVolumeRange() {
		return mediaVolumeRange;
	}

	public void setMediaVolumeRange(double mediaVolumeRange) {
		this.mediaVolumeRange = mediaVolumeRange;
	}

	public boolean isSamplingAutomation() {
		return samplingAutomation;
	}

	public void setSamplingAutomation(boolean samplingAutomation) {
		this.samplingAutomation = samplingAutomation;
	}

	public String getOperationalStatus() {
		return operationalStatus;
	}

	public void setOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
	}

}
