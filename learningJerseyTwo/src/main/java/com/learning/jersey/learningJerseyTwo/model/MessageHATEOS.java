package com.learning.jersey.learningJerseyTwo.model;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageHATEOS {
	private int id;
	private String message;
	private String author;
	private Date date;
	private ArrayList<Link> links;
	
	public MessageHATEOS() {
		// TODO Auto-generated constructor stub
	}
	public MessageHATEOS(int id, String message, String author, Date date) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.date = date;
	}

	public ArrayList<Link> getLinks() {
		return links;
	}
	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
