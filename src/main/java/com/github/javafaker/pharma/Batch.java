package com.github.javafaker.pharma;

import java.util.Date;

public class Batch {

	private String batchId;
	private String productName;
	private String recipeName;
	private Date startDate;
	private Date endDate;
	private String status;
	private Integer plannedQuantityProduced;
	private Date createdAt;
	private Date updatedAt;
	private Integer actualQuantityProduced;

	public Batch(String batchId, String productName, String recipeName, Date startDate, Date endDate, String status,
			Integer plannedQuantityProduced, Date createdAt, Date updatedAt, Integer actualQuantityProduced) {
		super();
		this.batchId = batchId;
		this.productName = productName;
		this.recipeName = recipeName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.plannedQuantityProduced = plannedQuantityProduced;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.actualQuantityProduced = actualQuantityProduced;
	}

	public Batch() {
		super();
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPlannedQuantityProduced() {
		return plannedQuantityProduced;
	}

	public void setPlannedQuantityProduced(Integer plannedQuantityProduced) {
		this.plannedQuantityProduced = plannedQuantityProduced;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getActualQuantityProduced() {
		return actualQuantityProduced;
	}

	public void setActualQuantityProduced(Integer actualQuantityProduced) {
		this.actualQuantityProduced = actualQuantityProduced;
	}

}
