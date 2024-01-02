package com.github.javafaker.pharma;

public class Fermenter {
	private double vesselVolume;
	private String vesselMaterial;
	private String agitationType;
	private String agitationSpeedRange;
	private String temperatureControlRange;
	private String pHControlRange;
	private int numberOfSamplingPorts;
	private String inoculationMethod;
	private String harvestMethod;
	private boolean cleaningInPlaceSystem;
	private boolean sterilizationInPlaceSystem;
	private String controlSystemType;

	public Fermenter(double vesselVolume, String vesselMaterial, String agitationType, String agitationSpeedRange,
			String temperatureControlRange, String pHControlRange, int numberOfSamplingPorts, String inoculationMethod,
			String harvestMethod, boolean cleaningInPlaceSystem, boolean sterilizationInPlaceSystem,
			String controlSystemType) {
		super();
		this.vesselVolume = vesselVolume;
		this.vesselMaterial = vesselMaterial;
		this.agitationType = agitationType;
		this.agitationSpeedRange = agitationSpeedRange;
		this.temperatureControlRange = temperatureControlRange;
		this.pHControlRange = pHControlRange;
		this.numberOfSamplingPorts = numberOfSamplingPorts;
		this.inoculationMethod = inoculationMethod;
		this.harvestMethod = harvestMethod;
		this.cleaningInPlaceSystem = cleaningInPlaceSystem;
		this.sterilizationInPlaceSystem = sterilizationInPlaceSystem;
		this.controlSystemType = controlSystemType;
	}

	public Fermenter() {
		super();
	}

	public double getVesselVolume() {
		return vesselVolume;
	}

	public void setVesselVolume(double vesselVolume) {
		this.vesselVolume = vesselVolume;
	}

	public String getVesselMaterial() {
		return vesselMaterial;
	}

	public void setVesselMaterial(String vesselMaterial) {
		this.vesselMaterial = vesselMaterial;
	}

	public String getAgitationType() {
		return agitationType;
	}

	public void setAgitationType(String agitationType) {
		this.agitationType = agitationType;
	}

	public String getAgitationSpeedRange() {
		return agitationSpeedRange;
	}

	public void setAgitationSpeedRange(String agitationSpeedRange) {
		this.agitationSpeedRange = agitationSpeedRange;
	}

	public String getTemperatureControlRange() {
		return temperatureControlRange;
	}

	public void setTemperatureControlRange(String temperatureControlRange) {
		this.temperatureControlRange = temperatureControlRange;
	}

	public String getpHControlRange() {
		return pHControlRange;
	}

	public void setpHControlRange(String pHControlRange) {
		this.pHControlRange = pHControlRange;
	}

	public int getNumberOfSamplingPorts() {
		return numberOfSamplingPorts;
	}

	public void setNumberOfSamplingPorts(int numberOfSamplingPorts) {
		this.numberOfSamplingPorts = numberOfSamplingPorts;
	}

	public String getInoculationMethod() {
		return inoculationMethod;
	}

	public void setInoculationMethod(String inoculationMethod) {
		this.inoculationMethod = inoculationMethod;
	}

	public String getHarvestMethod() {
		return harvestMethod;
	}

	public void setHarvestMethod(String harvestMethod) {
		this.harvestMethod = harvestMethod;
	}

	public boolean isCleaningInPlaceSystem() {
		return cleaningInPlaceSystem;
	}

	public void setCleaningInPlaceSystem(boolean cleaningInPlaceSystem) {
		this.cleaningInPlaceSystem = cleaningInPlaceSystem;
	}

	public boolean isSterilizationInPlaceSystem() {
		return sterilizationInPlaceSystem;
	}

	public void setSterilizationInPlaceSystem(boolean sterilizationInPlaceSystem) {
		this.sterilizationInPlaceSystem = sterilizationInPlaceSystem;
	}

	public String getControlSystemType() {
		return controlSystemType;
	}

	public void setControlSystemType(String controlSystemType) {
		this.controlSystemType = controlSystemType;
	}

}
