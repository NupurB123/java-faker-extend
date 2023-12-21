package com.github.javafaker;

public class Equipment {

	private String name;
	private String type;
	private String location;
	private String status;

	// Constructor
	public Equipment() {

	}

	public Equipment(String name, String type, String location) {
		this.name = name;
		this.type = type;
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
