package com.asiainfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car2 {
	@Value("Benz")
	private String brand;
	@Value("${bbb}")
	private String maxSpeed;
	
	@Override
	public String toString() {
		return "Car2 [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
	}

}
