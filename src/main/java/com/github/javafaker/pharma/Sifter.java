package com.github.javafaker.pharma;

public class Sifter {
	private String meshSizeRange;
	private Integer siftingSpeed;

	public Sifter(String meshSizeRange, Integer siftingSpeed) {
		super();
		this.meshSizeRange = meshSizeRange;
		this.siftingSpeed = siftingSpeed;
	}

	public Sifter() {
		super();
	}

	public String getMeshSizeRange() {
		return meshSizeRange;
	}

	public void setMeshSizeRange(String meshSizeRange) {
		this.meshSizeRange = meshSizeRange;
	}

	public Integer getSiftingSpeed() {
		return siftingSpeed;
	}

	public void setSiftingSpeed(Integer siftingSpeed) {
		this.siftingSpeed = siftingSpeed;
	}

}
