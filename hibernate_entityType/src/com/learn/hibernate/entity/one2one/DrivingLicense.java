package com.learn.hibernate.entity.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Driving_License_o2o")
public class DrivingLicense {
	@Id
	@GeneratedValue
	@Column (name = "DL_Number")
	private int dlNum;
	
	@Column (name = "type_of_vehicle")
	private String typeOfVehicle;
	
	public DrivingLicense() {
		// TODO Auto-generated constructor stub
	}
	public DrivingLicense(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public int getDlNum() {
		return dlNum;
	}
	public void setDlNum(int dlNum) {
		this.dlNum = dlNum;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
}
