package com.java.learn.basics.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main(String[] args) throws IOException {
		Example x = new Example();
		x.setI(5);
		File file = new File("ex.txt");
		System.out.println(file.getAbsolutePath());
		FileOutputStream fis = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(x);
		oos.close();
		file.delete();
	}
}
class Example implements Serializable{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
