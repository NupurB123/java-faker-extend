package com.github.javafaker.pharma;

public class Spectrophotometer {
	private String wavelengthRange;
	private String bandwidth;
	private int sampleCapacity;
	private String photometricAccuracy;

	public Spectrophotometer(String wavelengthRange, String bandwidth, int sampleCapacity, String photometricAccuracy) {
		super();
		this.wavelengthRange = wavelengthRange;
		this.bandwidth = bandwidth;
		this.sampleCapacity = sampleCapacity;
		this.photometricAccuracy = photometricAccuracy;
	}

	public Spectrophotometer() {
		super();
	}

	public String getWavelengthRange() {
		return wavelengthRange;
	}

	public void setWavelengthRange(String wavelengthRange) {
		this.wavelengthRange = wavelengthRange;
	}

	public String getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	public int getSampleCapacity() {
		return sampleCapacity;
	}

	public void setSampleCapacity(int sampleCapacity) {
		this.sampleCapacity = sampleCapacity;
	}

	public String getPhotometricAccuracy() {
		return photometricAccuracy;
	}

	public void setPhotometricAccuracy(String photometricAccuracy) {
		this.photometricAccuracy = photometricAccuracy;
	}

}
