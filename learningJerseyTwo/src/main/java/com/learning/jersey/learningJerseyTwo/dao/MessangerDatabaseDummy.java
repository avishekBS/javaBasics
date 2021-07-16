package com.learning.jersey.learningJerseyTwo.dao;

import java.util.HashMap;

import com.learning.jersey.learningJerseyTwo.model.Message;
import com.learning.jersey.learningJerseyTwo.model.MessageHATEOS;

public class MessangerDatabaseDummy {
	
	private static HashMap<Integer, Message> messagesDummyDao = new HashMap<Integer, Message>();
	
	private static HashMap<Integer, String> ProfiesDummyDao = new HashMap<Integer, String>();
	
	private static HashMap<Integer, MessageHATEOS> messageHATEOSDummyDao = new HashMap<Integer, MessageHATEOS>();

	public static HashMap<Integer, Message> getMessagesDummyDao() {
		return messagesDummyDao;
	}

	public static HashMap<Integer, String> getProfiesDummyDao() {
		return ProfiesDummyDao;
	}

	public static HashMap<Integer, MessageHATEOS> getMessageHATEOSDummyDao() {
		return messageHATEOSDummyDao;
	}
	

}
