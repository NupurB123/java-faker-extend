package com.github.javafaker.pharma;

public class Titrator {
	private String titrationMethod;
	private int detectionChannels;
	private int sampleThroughput;
	private String automationLevel;

	public Titrator(String titrationMethod, int detectionChannels, int sampleThroughput, String automationLevel) {
		super();
		this.titrationMethod = titrationMethod;
		this.detectionChannels = detectionChannels;
		this.sampleThroughput = sampleThroughput;
		this.automationLevel = automationLevel;
	}

	public Titrator() {
		super();
	}

	public String getTitrationMethod() {
		return titrationMethod;
	}

	public void setTitrationMethod(String titrationMethod) {
		this.titrationMethod = titrationMethod;
	}

	public int getDetectionChannels() {
		return detectionChannels;
	}

	public void setDetectionChannels(int detectionChannels) {
		this.detectionChannels = detectionChannels;
	}

	public int getSampleThroughput() {
		return sampleThroughput;
	}

	public void setSampleThroughput(int sampleThroughput) {
		this.sampleThroughput = sampleThroughput;
	}

	public String getAutomationLevel() {
		return automationLevel;
	}

	public void setAutomationLevel(String automationLevel) {
		this.automationLevel = automationLevel;
	}

}
