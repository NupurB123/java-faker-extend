package com.github.javafaker.pharma;

public class TabletDeduster {
	private Integer dedustingEfficiency;
	private Integer dedustingSpeed;

	public TabletDeduster(Integer dedustingEfficiency, Integer dedustingSpeed) {
		super();
		this.dedustingEfficiency = dedustingEfficiency;
		this.dedustingSpeed = dedustingSpeed;
	}

	public TabletDeduster() {
		super();
	}

	public Integer getDedustingEfficiency() {
		return dedustingEfficiency;
	}

	public void setDedustingEfficiency(Integer dedustingEfficiency) {
		this.dedustingEfficiency = dedustingEfficiency;
	}

	public Integer getDedustingSpeed() {
		return dedustingSpeed;
	}

	public void setDedustingSpeed(Integer dedustingSpeed) {
		this.dedustingSpeed = dedustingSpeed;
	}

}
