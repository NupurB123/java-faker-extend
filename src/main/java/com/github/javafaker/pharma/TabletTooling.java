package com.github.javafaker.pharma;

public class TabletTooling {
	private String toolingSize;
	private String toolingShape;

	public TabletTooling(String toolingSize, String toolingShape) {
		super();
		this.toolingSize = toolingSize;
		this.toolingShape = toolingShape;
	}

	public TabletTooling() {
		super();
	}

	public String getToolingSize() {
		return toolingSize;
	}

	public void setToolingSize(String toolingSize) {
		this.toolingSize = toolingSize;
	}

	public String getToolingShape() {
		return toolingShape;
	}

	public void setToolingShape(String toolingShape) {
		this.toolingShape = toolingShape;
	}

}
