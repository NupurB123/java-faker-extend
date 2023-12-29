package com.github.javafaker.pharma;

public class Dryer {
	public String dryingTechnology;
	public Integer maxDryingTemperature;

	public String getDryingTechnology() {
		return dryingTechnology;
	}

	public void setDryingTechnology(String dryingTechnology) {
		this.dryingTechnology = dryingTechnology;
	}

	public Integer getMaxDryingTemperature() {
		return maxDryingTemperature;
	}

	public void setMaxDryingTemperature(Integer maxDryingTemperature) {
		this.maxDryingTemperature = maxDryingTemperature;
	}

	public Dryer() {
		super();
	}

	public Dryer(String dryingTechnology, Integer maxDryingTemperature) {
		super();
		this.dryingTechnology = dryingTechnology;
		this.maxDryingTemperature = maxDryingTemperature;
	}
}
