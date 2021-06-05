package com.java.learn.basics.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
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
	@Override
	public int compareTo(Student o) {
		return marks> o.marks? 1:-1; //marks in ascending order
	}
}
public class ArrayListSortComparable {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(87, 839021, "Avishek"));
		students.add(new Student(68, 839011, "Poushali"));
		students.add(new Student(97, 839001, "shutup"));
		students.add(new Student(9, 839021, "faltu"));
		
		Collections.sort(students);
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
