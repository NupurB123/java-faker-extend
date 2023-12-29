package com.github.javafaker.pharma;

public class TabletPress {
	private Integer maxTabletOutput;
	private String compressionForceRange;

	public TabletPress(Integer maxTabletOutput, String compressionForceRange) {
		super();
		this.maxTabletOutput = maxTabletOutput;
		this.compressionForceRange = compressionForceRange;
	}

	public TabletPress() {
		super();
	}

	public Integer getMaxTabletOutput() {
		return maxTabletOutput;
	}

	public void setMaxTabletOutput(Integer maxTabletOutput) {
		this.maxTabletOutput = maxTabletOutput;
	}

	public String getCompressionForceRange() {
		return compressionForceRange;
	}

	public void setCompressionForceRange(String compressionForceRange) {
		this.compressionForceRange = compressionForceRange;
	}

}
