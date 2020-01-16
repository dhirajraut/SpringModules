package com.galaxy.spring.model;

public class Product {
	int id;
	String name;
	double amount;

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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Product(final int id, final String name, final double amount) {
		this.name = name;
		this.amount = amount;
	}
}
