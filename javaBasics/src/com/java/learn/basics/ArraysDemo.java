package com.java.learn.basics;

public class ArraysDemo {
	public static void main(String[] args) {
		/*
		 * Default value of Int index is 0
		 * 
		 */
		int[] intArray = new int[5];
		System.out.println("default value of int array index:"+intArray[0]);
		/*
		 * Default value of String index is null
		 * 
		 */
		String[] stringArray = new String[5];
		System.out.println("default value of string array index:"+stringArray[0]);
		/*
		 * Default value of Char index is space
		 * 
		 */
		char[] charArray = new char[5];
		System.out.println("default value of char array index:"+charArray[0]);
		
		/*
		 * Assign values to array index
		 */
		intArray[0] = 10;
		
		try {
			intArray[5] = 8;  // This is error as your array size is 5 so the last index is 4 so cant assign value 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*
		 * Without initialise assign value to array directly
		 */
		int[] intArr = {1, 2, 3};
		System.out.println("assign value directly to array without initialisation: int[] intArr = {1, 2, 3};");
		
		/*
		 * Array of defined objects
		 */
		class Student{
			int rollNo;
			String name;
		}
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student studentArr[] = new Student[3];
		Student studentArr2[] = {student1, student2, student3};
	}
}
