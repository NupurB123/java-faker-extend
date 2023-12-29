package com.github.javafaker.pharma;

public class Stirrer {
	private String stirringSpeedRange;

	public Stirrer(String stirringSpeedRange) {
		super();
		this.stirringSpeedRange = stirringSpeedRange;
	}

	public Stirrer() {
		super();
	}

	public String getStirringSpeedRange() {
		return stirringSpeedRange;
	}

	public void setStirringSpeedRange(String stirringSpeedRange) {
		this.stirringSpeedRange = stirringSpeedRange;
	}

}
