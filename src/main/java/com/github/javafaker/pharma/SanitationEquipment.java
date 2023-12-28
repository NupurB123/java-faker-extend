package com.github.javafaker.pharma;

public class SanitationEquipment {
	private String equipmentName;
	private String type;
	private String manufacturer;

	public SanitationEquipment(String equipmentName, String type, String manufacturer) {
		super();
		this.equipmentName = equipmentName;
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public SanitationEquipment() {
		super();
	}

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
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
