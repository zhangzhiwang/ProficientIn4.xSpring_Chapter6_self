package com.asiainfo;

public class Car {
	public String brand;
	public String maxSpeed;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
//	public String getBrand() {
//		return brand;
//	}
//
//	public String getMaxSpeed() {
//		return maxSpeed;
//	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}

}
