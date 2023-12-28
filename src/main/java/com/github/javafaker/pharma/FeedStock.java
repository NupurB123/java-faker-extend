package com.github.javafaker.pharma;

import java.util.Date;

public class FeedStock {
	private String feedStockType; // nutrient, supplement, etc.
	private String composition; // Could be provided as a JSON string or plain text
	private double optimalUseRate; // Numerical value representing the optimal usage rate
	private String manufacturer;
	private Date expiryDate;
	private String storageConditions; // Descriptive text on how to store the feed stock

	public FeedStock(String feedStockType, String composition, double optimalUseRate, String manufacturer,
			Date expiryDate, String storageConditions) {
		super();
		this.feedStockType = feedStockType;
		this.composition = composition;
		this.optimalUseRate = optimalUseRate;
		this.manufacturer = manufacturer;
		this.expiryDate = expiryDate;
		this.storageConditions = storageConditions;
	}

	public FeedStock() {
		super();
	}

	public String getFeedStockType() {
		return feedStockType;
	}

	public void setFeedStockType(String feedStockType) {
		this.feedStockType = feedStockType;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public double getOptimalUseRate() {
		return optimalUseRate;
	}

	public void setOptimalUseRate(double optimalUseRate) {
		this.optimalUseRate = optimalUseRate;
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

	public String getStorageConditions() {
		return storageConditions;
	}

	public void setStorageConditions(String storageConditions) {
		this.storageConditions = storageConditions;
	}

}
