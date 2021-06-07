package com.java.learn.basics.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, Student> studentsMap = new HashMap<>();
		studentsMap.put(3, new Student(87, 839021, "Avishek"));
		studentsMap.put(1, new Student(68, 839011, "Poushali"));
		studentsMap.put(4, new Student(97, 839001, "shutup"));
		studentsMap.put(2, new Student(9, 839021, "faltu"));
		studentsMap.put(5, new Student(9, 839021, "faltu"));
		
		System.out.println("Find key only:"+ studentsMap.keySet());
		System.out.println("Find values only:"+ studentsMap.values());
		System.out.println("Find key and values"+studentsMap.entrySet());
		
		studentsMap.entrySet().forEach(System.out::println);
		
		System.out.println("**********ITERATOR**********");
		Set<Map.Entry<Integer, Student>> studentEntry = studentsMap.entrySet();
		Iterator<Entry<Integer, Student>> itr = studentEntry.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
class Student{
	int marks, rollNo;
	String name;
	public Student(int marks, int rollNo, String name) {
		this.marks = marks;
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
