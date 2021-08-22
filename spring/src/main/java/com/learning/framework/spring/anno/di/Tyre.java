package com.learning.framework.spring.anno.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String manufacture;
	private int tyreSize;
	
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public int getTyreSize() {
		return tyreSize;
	}
	public void setTyreSize(int tyreSize) {
		this.tyreSize = tyreSize;
	}
}
