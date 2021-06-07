package com.java.learn.basics.map;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties propertiesSet = new Properties();
		propertiesSet.setProperty("Name", "Avishek");
		propertiesSet.setProperty("Age", "33");
		propertiesSet.setProperty("DOB", "01-Jul-1988");
		propertiesSet.store(new FileWriter("example.properties"), "just an Demo");
		
		FileReader reader = new FileReader("example.properties");
		Properties propertiesGet = new Properties();
		propertiesGet.load(reader);
		propertiesGet.stringPropertyNames().forEach(System.out::println);
		propertiesGet.entrySet().forEach(System.out::println);
		
	}

}
