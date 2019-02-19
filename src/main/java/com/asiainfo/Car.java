package com.asiainfo;

public class Car {
	private String brand;
	private String maxSpeed;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}

}
