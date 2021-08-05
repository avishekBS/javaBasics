package com.learn.hibernate.entity.one2one;

import java.util.ArrayList;
import java.util.Collection;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="user_details_o2o")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	@Column (name = "user_name")
	private String username;
	
	@OneToOne
	@JoinColumn (name = "driving_License_id")
	//@Cascade (CascadeType.PERSIST)
	private DrivingLicense drivingLicense;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String username, DrivingLicense drivingLicense) {
		this.userId = userId;
		this.username = username;
		this.drivingLicense = drivingLicense;
	}

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

	public DrivingLicense getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(DrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + "]";
	}

}
