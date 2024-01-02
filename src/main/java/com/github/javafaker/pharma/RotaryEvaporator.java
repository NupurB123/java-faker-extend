package com.github.javafaker.pharma;

public class RotaryEvaporator {
	private double evaporationFlaskVolume;
	private String temperatureRange;
	private int rotationSpeed;
	private String condenserType;

	public double getEvaporationFlaskVolume() {
		return evaporationFlaskVolume;
	}

	public void setEvaporationFlaskVolume(double evaporationFlaskVolume) {
		this.evaporationFlaskVolume = evaporationFlaskVolume;
	}

	public String getTemperatureRange() {
		return temperatureRange;
	}

	public void setTemperatureRange(String temperatureRange) {
		this.temperatureRange = temperatureRange;
	}

	public int getRotationSpeed() {
		return rotationSpeed;
	}

	public void setRotationSpeed(int rotationSpeed) {
		this.rotationSpeed = rotationSpeed;
	}

	public String getCondenserType() {
		return condenserType;
	}

	public void setCondenserType(String condenserType) {
		this.condenserType = condenserType;
	}

}
