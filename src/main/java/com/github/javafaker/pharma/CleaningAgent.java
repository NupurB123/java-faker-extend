package com.github.javafaker.pharma;

public class CleaningAgent {
	private String agentName;
	private String type;
	private String manufacturer;

	public CleaningAgent(String agentName, String type, String manufacturer) {
		super();
		this.agentName = agentName;
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public CleaningAgent() {
		super();
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
