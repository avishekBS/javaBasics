package com.java.learn.basics.io;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

public class XMLEncoding {
	public static void main(String[] args) throws FileNotFoundException {
		SomeDataCollection someDataCollection = new  SomeDataCollection();
		someDataCollection.setListofdata(Arrays.asList(new SomeData(8, "AVishek"), new SomeData(18, "Banik")));
		File file = new File("xmlEncode.xml");
		XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(file)));
		xmlEncoder.writeObject(someDataCollection);
		xmlEncoder.close();
	}
}

class SomeDataCollection{
	public List<SomeData> listofdata;

	public List<SomeData> getListofdata() {
		return listofdata;
	}

	public void setListofdata(List<SomeData> listofdata) {
		this.listofdata = listofdata;
	}
	
}
class SomeData{
	public int number;
	public String name;
	
	public SomeData(int number, String name) {
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "SomeData [number=" + number + ", name=" + name + "]";
	}
}
