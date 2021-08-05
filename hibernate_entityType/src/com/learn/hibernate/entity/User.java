package com.learn.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GeneratorType;

@Entity (name = "details") //--> when table name is not found it takes Entity name as table name
@Table (name = "user_details")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int userId;
	
	@Column (name = "user_name")
	private String userName;
	
	@Column(name = "created_date")
	@Temporal (TemporalType.DATE)
	private Date enteredDate;
	
	@Lob
	private String description;
	
	@Transient
	private String others;

	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userName, Date enteredDate, String description, String others) {
		this.userName = userName;
		this.enteredDate = enteredDate;
		this.description = description;
		this.others = others;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getEnteredDate() {
		return enteredDate;
	}

	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + userName + ", enteredDate=" + enteredDate + ", description="
				+ description + ", others=" + others + "]";
	}
}
