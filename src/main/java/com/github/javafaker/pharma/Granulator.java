package com.github.javafaker.pharma;

public class Granulator {
	public Integer granulationCapacity;
	public Integer maxOperatingSpeed;

	public Granulator(Integer granulationCapacity, Integer maxOperatingSpeed) {
		super();
		this.granulationCapacity = granulationCapacity;
		this.maxOperatingSpeed = maxOperatingSpeed;
	}

	public Granulator() {
		super();
	}

	public Integer getGranulationCapacity() {
		return granulationCapacity;
	}

	public void setGranulationCapacity(Integer granulationCapacity) {
		this.granulationCapacity = granulationCapacity;
	}

	public Integer getMaxOperatingSpeed() {
		return maxOperatingSpeed;
	}

	public void setMaxOperatingSpeed(Integer maxOperatingSpeed) {
		this.maxOperatingSpeed = maxOperatingSpeed;
	}

}
