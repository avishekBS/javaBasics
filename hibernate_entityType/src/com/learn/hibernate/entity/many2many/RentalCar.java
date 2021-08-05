package com.learn.hibernate.entity.many2many;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "rental_car")
public class RentalCar {
	
	@Id
	@GeneratedValue
	@Column (name="registration_Id")
	private int registrationNum;
	
	@Column (name="Type_of_vehicle")
	private String vehicleType;
	
	@Column (name="vehicle_name")
	private String vehicleName;
	
	@ManyToMany (mappedBy = "listOfCarRented")
	private Collection<User> listOfUsers = new ArrayList<User>();
	
	public RentalCar() {
		// TODO Auto-generated constructor stub
	}
	
	
	public RentalCar(String vehicleType, String vehicleName) {
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
	public Collection<User> getListOfUsers() {
		return listOfUsers;
	}
	public void setListOfUsers(Collection<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
}
