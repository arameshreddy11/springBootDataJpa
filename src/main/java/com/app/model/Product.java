package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer proId;
	private String prodCode;
	private double prodCost;
	public Product() {
		super();
	}
	public Product(String prodCode, double prodCost) {
		super();
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	public Product(Integer proId, String prodCode, double prodCost) {
		super();
		this.proId = proId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + "]";
	}
	
}
