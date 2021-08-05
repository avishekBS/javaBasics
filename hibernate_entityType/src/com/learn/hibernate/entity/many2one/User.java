package com.learn.hibernate.entity.many2one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="user_details_m2o")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	
	@Column (name = "user_name")
	private String username;
	
	//@OneToMany
	//@JoinTable (name = "user_vehicle_o2m",
	//			joinColumns = @JoinColumn(name="user_id"),
	//			inverseJoinColumns = @JoinColumn(name="registration_id"))
	//private Collection<Vehicle> listOfVehicle = new ArrayList<>();


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
