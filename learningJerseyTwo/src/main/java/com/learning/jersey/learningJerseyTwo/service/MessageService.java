package com.learning.jersey.learningJerseyTwo.service;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.Context;

import com.learning.jersey.learningJerseyTwo.dao.MessangerDatabaseDummy;
import com.learning.jersey.learningJerseyTwo.exception.MessageNotFoundException;
import com.learning.jersey.learningJerseyTwo.model.Link;
import com.learning.jersey.learningJerseyTwo.model.Message;
import com.learning.jersey.learningJerseyTwo.model.MessageHATEOS;

public class MessageService {
	
	public HashMap<Integer, Message> messagesDummyDao = MessangerDatabaseDummy.getMessagesDummyDao();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public MessageService() throws ParseException {
		messagesDummyDao.put(1, new Message(1, "Hello Message 1", "Avishek", formatter.parse("10/07/2021")));
		messagesDummyDao.put(2, new Message(2, "Hello Message 2", "Avishek", formatter.parse("14/07/2021")));
	}
	public ArrayList<Message> getMessagesService() throws ParseException{
		return new ArrayList<Message>(messagesDummyDao.values());
		
	}
	public Message getMessageService(int id) throws MessageNotFoundException{
		Message msgObj = messagesDummyDao.get(id);
		if (msgObj !=null) {
			return msgObj;
		}
		throw new MessageNotFoundException("Message Id "+id +" not found.");
	}
	
	public ArrayList<Message> getMessageServiceForYearFilter(int year){
		ArrayList<Message> messages = new  ArrayList<Message>();
		Calendar cal = Calendar.getInstance();
		for (Integer key : messagesDummyDao.keySet()) {
			Message msgObj = messagesDummyDao.get(key);
			cal.setTime(msgObj.getDate());
			if (cal.get(Calendar.YEAR) == year) {
				messages.add(msgObj);
			}
		}
		return messages;
	}
	public Message addMessageService(Message message){
		int id = messagesDummyDao.size()+1;
		message.setId(id);
		messagesDummyDao.put(id, message);
		return messagesDummyDao.get(id);
	}
	public Message updateMessageService(int id, Message message) {
		message.setId(id);
		messagesDummyDao.replace(id, message);
		return messagesDummyDao.get(id);
	}
	public void deleteMessageService(int id) {
		messagesDummyDao.remove(id);
	}
	public List<Message> getMessageServiceForYearFilter(int startIndex, int searchSize) {
		ArrayList<Message> msgList = new ArrayList<Message>(messagesDummyDao.values());
		if (startIndex + searchSize > msgList.size())
			return msgList;
		return msgList.subList(startIndex, startIndex + searchSize);
	}
	public Message getMessageServiceHATEOS(int id){
		Message msgObj = messagesDummyDao.get(id);
		if (msgObj !=null) {
			return msgObj;
		}
		return msgObj;
	}
}
