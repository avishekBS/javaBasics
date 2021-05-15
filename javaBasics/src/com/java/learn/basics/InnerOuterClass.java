package com.java.learn.basics;

class Outer{

	class Inner1{
		void show() {
			// TODO Auto-generated method stub
			System.out.println("show inner1 MEMBER class method");
		}
	}
	static class Inner2{
		void show() {
			// TODO Auto-generated method stub
			System.out.println("show inner2 STATIC class method");
		}
	}
	public static Object Inner1;
}



public class InnerOuterClass {

	public static void main(String[] args) {
		/*
		 * To call inner1 class (member class) we have to create object of outer class 
		 */
		Outer outer = new Outer();
		Outer.Inner1  inner1= outer.new Inner1();
		inner1.show();
		
		/*
		 * To call inner1 class (STATIC class) we dont have to create object of outer class 
		 */
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.show();
	}

}
