package com.github.javafaker.pharma;

public class Mixer {
	private Integer mixingCapacity;
	private String mixerType;

	public Mixer(Integer mixingCapacity, String mixerType) {
		super();
		this.mixingCapacity = mixingCapacity;
		this.mixerType = mixerType;
	}

	public Mixer() {
		super();
	}

	public Integer getMixingCapacity() {
		return mixingCapacity;
	}

	public void setMixingCapacity(Integer mixingCapacity) {
		this.mixingCapacity = mixingCapacity;
	}

	public String getMixerType() {
		return mixerType;
	}

	public void setMixerType(String mixerType) {
		this.mixerType = mixerType;
	}

}
