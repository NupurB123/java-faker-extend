package com.github.javafaker.pharma;

import java.sql.Date;

public class Room {
	private String areaName;
	private String name;
	private String purpose;
	private Date lastSanitationDate;
	private int sanitationFrequency;

	public Room(String areaName, String name, String purpose, Date lastSanitationDate, int sanitationFrequency) {
		super();
		this.areaName = areaName;
		this.name = name;
		this.purpose = purpose;
		this.lastSanitationDate = lastSanitationDate;
		this.sanitationFrequency = sanitationFrequency;
	}

	public Room() {
		super();
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Date getLastSanitationDate() {
		return lastSanitationDate;
	}

	public void setLastSanitationDate(Date lastSanitationDate) {
		this.lastSanitationDate = lastSanitationDate;
	}

	public int getSanitationFrequency() {
		return sanitationFrequency;
	}

	public void setSanitationFrequency(int sanitationFrequency) {
		this.sanitationFrequency = sanitationFrequency;
	}

}
