package com.learn.hibernate.entity.one2many.embedded;

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
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="user_details_o2m")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	@Column (name = "user_name")
	private String username;
	@ElementCollection (//fetch = FetchType.EAGER
			)
	@JoinTable(name = "User_Address_o2m",
		joinColumns = @JoinColumn(name = "user_id")
	)
	@GenericGenerator(name = "address_gen", strategy = "native")
	@CollectionId(
	        columns=@Column(name="Address_Id"),
	        generator="address_gen",
	        type=@Type(type="long")
	    )
	private Collection<Address> listOfAddress = new ArrayList<Address>();
	
	public User() {
		// TODO Auto-generated constructor stub
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

	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + "]";
	}

}
