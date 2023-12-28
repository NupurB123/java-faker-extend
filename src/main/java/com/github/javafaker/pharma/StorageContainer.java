package com.github.javafaker.pharma;

public class StorageContainer {
	private String containerType;
	private String volumeWithUnit;

	public StorageContainer(String containerType, String volumeWithUnit) {
		super();
		this.containerType = containerType;
		this.volumeWithUnit = volumeWithUnit;
	}

	public StorageContainer() {
		super();
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getVolumeWithUnit() {
		return volumeWithUnit;
	}

	public void setVolumeWithUnit(String volumeWithUnit) {
		this.volumeWithUnit = volumeWithUnit;
	}

}
