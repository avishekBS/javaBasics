package com.java.learn.basics.io;

import java.beans.Transient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Example x = new Example("Avishek", "guessitandbewrong");
		File file = new File("ex.txt");
		System.out.println(file.getAbsolutePath());
		
		//write the object out-->
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(x);
		oos.close();
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Example ex = (Example)ois.readObject();
		System.out.println(ex.toString());
		file.delete();
	}
}
class Example implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -544445274560825837L;
	/**
	 * 
	 */
	private String username;
	
	private transient String password;

	public Example(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Example [username=" + username + ", password=" + password + "]";
	}
}
