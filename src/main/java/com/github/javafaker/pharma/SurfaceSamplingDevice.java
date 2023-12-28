package com.github.javafaker.pharma;

import java.sql.Date;

public class SurfaceSamplingDevice {
	private String deviceType; // e.g., Swab, Contact Plate, Rodac Plate
	private String manufacturer;
	private Date expirationDate;

	public SurfaceSamplingDevice() {
		super();
	}

	public SurfaceSamplingDevice(String deviceType, String manufacturer, Date expirationDate) {
		super();
		this.deviceType = deviceType;
		this.manufacturer = manufacturer;
		this.expirationDate = expirationDate;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
