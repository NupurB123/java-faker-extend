package com.github.javafaker.pharma;

import java.util.Date;

public class GrowthMedia {

	private String mediaName;
	private String mediaType; // e.g., Tryptic Soy Agar, Sabouraud Dextrose Agar
	private String manufacturer;
	private Date expirationDate;

	public GrowthMedia() {
		super();
	}

	public GrowthMedia(String mediaName, String mediaType, String manufacturer, Date expirationDate) {
		super();
		this.mediaType = mediaType;
		this.manufacturer = manufacturer;
		this.expirationDate = expirationDate;
		this.mediaName = mediaName;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
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
