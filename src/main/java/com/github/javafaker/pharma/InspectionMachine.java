package com.github.javafaker.pharma;

public class InspectionMachine {
	private Integer inspectionSpeed;
	private String technologyUsed;

	public InspectionMachine(Integer inspectionSpeed, String technologyUsed) {
		super();
		this.inspectionSpeed = inspectionSpeed;
		this.technologyUsed = technologyUsed;
	}

	public InspectionMachine() {
		super();
	}

	public Integer getInspectionSpeed() {
		return inspectionSpeed;
	}

	public void setInspectionSpeed(Integer inspectionSpeed) {
		this.inspectionSpeed = inspectionSpeed;
	}

	public String getTechnologyUsed() {
		return technologyUsed;
	}

	public void setTechnologyUsed(String technologyUsed) {
		this.technologyUsed = technologyUsed;
	}

}
