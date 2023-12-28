package com.github.javafaker.pharma;

import java.util.Date;

public class BufferSolution {
	private String bufferName;
	private double pHValue; // Assuming pH is represented as a numerical value
	private String composition; // Could be a JSON string or plain text
	private String manufacturer;
	private Date expiryDate;

	public BufferSolution(String bufferName, double pHValue, String composition, String manufacturer, Date expiryDate) {
		super();
		this.bufferName = bufferName;
		this.pHValue = pHValue;
		this.composition = composition;
		this.manufacturer = manufacturer;
		this.expiryDate = expiryDate;
	}

	public BufferSolution() {
		super();
	}

	public String getBufferName() {
		return bufferName;
	}

	public void setBufferName(String bufferName) {
		this.bufferName = bufferName;
	}

	public double getpHValue() {
		return pHValue;
	}

	public void setpHValue(double pHValue) {
		this.pHValue = pHValue;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
