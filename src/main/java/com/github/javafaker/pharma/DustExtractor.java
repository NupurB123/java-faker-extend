package com.github.javafaker.pharma;

public class DustExtractor {
	public Integer extractionCapacity;
	public String filterType;

	public DustExtractor(Integer extractionCapacity, String filterType) {
		super();
		this.extractionCapacity = extractionCapacity;
		this.filterType = filterType;
	}

	public DustExtractor() {
		super();
	}

	public Integer getExtractionCapacity() {
		return extractionCapacity;
	}

	public void setExtractionCapacity(Integer extractionCapacity) {
		this.extractionCapacity = extractionCapacity;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

}
