package com.github.javafaker.pharma;

import java.sql.Date;

public class PreparedSolution {
	private String chemicalName;
	private String concentration;
	private double volumePrepared;
	private String preparedBy;
	private Date preparationDate;
	private Date expiryDate;
	private String solutionParameters;

	public PreparedSolution(String chemicalName, String concentration, double volumePrepared, String preparedBy,
			Date preparationDate, Date expiryDate, String solutionParameters) {
		super();
		this.chemicalName = chemicalName;
		this.concentration = concentration;
		this.volumePrepared = volumePrepared;
		this.preparedBy = preparedBy;
		this.preparationDate = preparationDate;
		this.expiryDate = expiryDate;
		this.solutionParameters = solutionParameters;
	}

	public PreparedSolution() {
		super();
	}

	public String getChemicalName() {
		return chemicalName;
	}

	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}

	public String getConcentration() {
		return concentration;
	}

	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}

	public double getVolumePrepared() {
		return volumePrepared;
	}

	public void setVolumePrepared(double volumePrepared) {
		this.volumePrepared = volumePrepared;
	}

	public String getPreparedBy() {
		return preparedBy;
	}

	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}

	public Date getPreparationDate() {
		return preparationDate;
	}

	public void setPreparationDate(Date preparationDate) {
		this.preparationDate = preparationDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSolutionParameters() {
		return solutionParameters;
	}

	public void setSolutionParameters(String solutionParameters) {
		this.solutionParameters = solutionParameters;
	}

}
