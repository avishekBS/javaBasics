package com.java.learn.basics.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Student> studentsMap = new LinkedHashMap<>();
		studentsMap.put(3, new Student(87, 839021, "Avishek"));
		studentsMap.put(1, new Student(68, 839011, "Poushali"));
		studentsMap.put(4, new Student(97, 839001, "shutup"));
		studentsMap.put(2, new Student(9, 839021, "faltu"));
		
		System.out.println("Find key only:"+ studentsMap.keySet());
		System.out.println("Find values only:"+ studentsMap.values());
		System.out.println("Find key and values"+studentsMap.entrySet());
	}

}
