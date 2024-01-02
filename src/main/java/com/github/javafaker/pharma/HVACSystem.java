package com.github.javafaker.pharma;

public class HVACSystem {
	private String airflowRate;
	private boolean temperatureControl;
	private boolean humidityControl;
	private String filtrationLevels;
	private boolean backupSystems;

	public HVACSystem(String airflowRate, boolean temperatureControl, boolean humidityControl, String filtrationLevels,
			boolean backupSystems) {
		super();
		this.airflowRate = airflowRate;
		this.temperatureControl = temperatureControl;
		this.humidityControl = humidityControl;
		this.filtrationLevels = filtrationLevels;
		this.backupSystems = backupSystems;
	}

	public HVACSystem() {
		super();
	}

	public String getAirflowRate() {
		return airflowRate;
	}

	public void setAirflowRate(String airflowRate) {
		this.airflowRate = airflowRate;
	}

	public boolean isTemperatureControl() {
		return temperatureControl;
	}

	public void setTemperatureControl(boolean temperatureControl) {
		this.temperatureControl = temperatureControl;
	}

	public boolean isHumidityControl() {
		return humidityControl;
	}

	public void setHumidityControl(boolean humidityControl) {
		this.humidityControl = humidityControl;
	}

	public String getFiltrationLevels() {
		return filtrationLevels;
	}

	public void setFiltrationLevels(String filtrationLevels) {
		this.filtrationLevels = filtrationLevels;
	}

	public boolean isBackupSystems() {
		return backupSystems;
	}

	public void setBackupSystems(boolean backupSystems) {
		this.backupSystems = backupSystems;
	}

}
