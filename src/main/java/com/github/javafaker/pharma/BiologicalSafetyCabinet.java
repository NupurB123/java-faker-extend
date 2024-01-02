package com.github.javafaker.pharma;

public class BiologicalSafetyCabinet {
	private String classType;
	private String hepaFiltrationEfficiency;
	private String airflowPattern;
	private double sashHeight;

	public BiologicalSafetyCabinet(String classType, String hepaFiltrationEfficiency, String airflowPattern,
			double sashHeight) {
		super();
		this.classType = classType;
		this.hepaFiltrationEfficiency = hepaFiltrationEfficiency;
		this.airflowPattern = airflowPattern;
		this.sashHeight = sashHeight;
	}

	public BiologicalSafetyCabinet() {
		super();
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getHepaFiltrationEfficiency() {
		return hepaFiltrationEfficiency;
	}

	public void setHepaFiltrationEfficiency(String hepaFiltrationEfficiency) {
		this.hepaFiltrationEfficiency = hepaFiltrationEfficiency;
	}

	public String getAirflowPattern() {
		return airflowPattern;
	}

	public void setAirflowPattern(String airflowPattern) {
		this.airflowPattern = airflowPattern;
	}

	public double getSashHeight() {
		return sashHeight;
	}

	public void setSashHeight(double sashHeight) {
		this.sashHeight = sashHeight;
	}

}
