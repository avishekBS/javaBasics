package com.learn.hibernate.entity.one2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "vehicle_o2m")
public class Vehicle {
	
	@Id
	@GeneratedValue
	@Column (name="registration_Id")
	private int registrationNum;
	
	@Column (name="Type_of_vehicle")
	private String vehicleType;
	
	@Column (name="vehicle_name")
	private String vehicleName;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Vehicle(String vehicleType, String vehicleName) {
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
	}

	public int getRegistrationNum() {
		return registrationNum;
	}
	public void setRegistrationNum(int registrationNum) {
		this.registrationNum = registrationNum;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	

}
