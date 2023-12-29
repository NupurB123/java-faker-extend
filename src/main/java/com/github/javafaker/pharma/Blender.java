package com.github.javafaker.pharma;

public class Blender {
	public Integer blendingVolume;
	public String blendingSpeedRange;

	public Blender(Integer blendingVolume, String blendingSpeedRange) {
		super();
		this.blendingVolume = blendingVolume;
		this.blendingSpeedRange = blendingSpeedRange;
	}

	public Blender() {
		super();
	}

	public Integer getBlendingVolume() {
		return blendingVolume;
	}

	public void setBlendingVolume(Integer blendingVolume) {
		this.blendingVolume = blendingVolume;
	}

	public String getBlendingSpeedRange() {
		return blendingSpeedRange;
	}

	public void setBlendingSpeedRange(String blendingSpeedRange) {
		this.blendingSpeedRange = blendingSpeedRange;
	}

}
