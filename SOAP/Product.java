package com.soap.service;

public class Product {

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, String category, double unitprice) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.unitprice = unitprice;
	}

	private int id;
	private String name;
	private String category;
	private double unitprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
}
