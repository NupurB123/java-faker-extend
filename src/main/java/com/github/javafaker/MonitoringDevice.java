package com.github.javafaker;

import java.security.Timestamp;

public class MonitoringDevice {

	private String type;
	private String model;
	private String location;
	private String status;
	private Timestamp installationDate;
	private Timestamp lastMaintainanceDate;
	private Timestamp nextMaintainanceDate;

	public MonitoringDevice() {

	}

	public MonitoringDevice(String type, String model, String location) {
		this.type = type;
		this.model = model;
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(Timestamp installationDate) {
		this.installationDate = installationDate;
	}

	public Timestamp getLastMaintainanceDate() {
		return lastMaintainanceDate;
	}

	public void setLastMaintainanceDate(Timestamp lastMaintainanceDate) {
		this.lastMaintainanceDate = lastMaintainanceDate;
	}

	public Timestamp getNextMaintainanceDate() {
		return nextMaintainanceDate;
	}

	public void setNextMaintainanceDate(Timestamp nextMaintainanceDate) {
		this.nextMaintainanceDate = nextMaintainanceDate;
	}

}
