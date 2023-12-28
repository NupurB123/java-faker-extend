package com.github.javafaker.pharma;

import java.util.Date;

public class WaterSystem {
	private String systemName;
	private String systemType; // e.g., WFI - Water for Injection, Purified Water
	private String description;
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // The frequency could be in days, months, etc.
	private String monitoringPoints; // This could either be descriptive text or an ID/link to a related table.

	public WaterSystem(String systemName, String systemType, String description, Date lastMaintenanceDate,
			int maintenanceFrequency, String monitoringPoints) {
		super();
		this.systemName = systemName;
		this.systemType = systemType;
		this.description = description;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.monitoringPoints = monitoringPoints;
	}

	public WaterSystem() {
		super();
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemType() {
		return systemType;
	}

	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getMonitoringPoints() {
		return monitoringPoints;
	}

	public void setMonitoringPoints(String monitoringPoints) {
		this.monitoringPoints = monitoringPoints;
	}

}
