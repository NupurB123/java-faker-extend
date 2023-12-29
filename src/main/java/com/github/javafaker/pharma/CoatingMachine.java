package com.github.javafaker.pharma;

public class CoatingMachine {
	public String coatingTechnology;
	public Integer maxBatchSize;

	public CoatingMachine(String coatingTechnology, Integer maxBatchSize) {
		super();
		this.coatingTechnology = coatingTechnology;
		this.maxBatchSize = maxBatchSize;
	}

	public CoatingMachine() {
		super();
	}

	public String getCoatingTechnology() {
		return coatingTechnology;
	}

	public void setCoatingTechnology(String coatingTechnology) {
		this.coatingTechnology = coatingTechnology;
	}

	public Integer getMaxBatchSize() {
		return maxBatchSize;
	}

	public void setMaxBatchSize(Integer maxBatchSize) {
		this.maxBatchSize = maxBatchSize;
	}

}
