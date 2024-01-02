package com.github.javafaker.pharma;

public class TOCAnalyzer {
	private String detectionRange;
	private String detectionMethod;
	private String samplingMethod;
	private String analysisTime;

	public TOCAnalyzer(String detectionRange, String detectionMethod, String samplingMethod, String analysisTime) {
		super();
		this.detectionRange = detectionRange;
		this.detectionMethod = detectionMethod;
		this.samplingMethod = samplingMethod;
		this.analysisTime = analysisTime;
	}

	public TOCAnalyzer() {
		super();
	}

	public String getDetectionRange() {
		return detectionRange;
	}

	public void setDetectionRange(String detectionRange) {
		this.detectionRange = detectionRange;
	}

	public String getDetectionMethod() {
		return detectionMethod;
	}

	public void setDetectionMethod(String detectionMethod) {
		this.detectionMethod = detectionMethod;
	}

	public String getSamplingMethod() {
		return samplingMethod;
	}

	public void setSamplingMethod(String samplingMethod) {
		this.samplingMethod = samplingMethod;
	}

	public String getAnalysisTime() {
		return analysisTime;
	}

	public void setAnalysisTime(String analysisTime) {
		this.analysisTime = analysisTime;
	}

}
