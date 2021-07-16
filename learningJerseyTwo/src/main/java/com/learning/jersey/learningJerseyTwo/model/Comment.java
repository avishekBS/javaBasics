package com.learning.jersey.learningJerseyTwo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment {
	
	private int commentId;
	private int messageId;
	private String author;
	private String comment;
	
	public Comment() {
		
	}

	public Comment(int commentId, int messageId, String author, String comment) {
		this.commentId = commentId;
		this.messageId = messageId;
		this.author = author;
		this.comment = comment;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
