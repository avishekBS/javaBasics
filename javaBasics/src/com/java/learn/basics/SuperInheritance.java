package com.java.learn.basics;
class A{
	public A() {
		System.out.println("Class A default-Constructor");
	}
	public A(int i) {
		System.out.println("Class A parameterised-Constructor");
	}
}

class B extends A{
	public B() {
		System.out.println("Class B parameterised-Constructor");
	}
	public B(int i) {
		System.out.println("Class B parameterised-Constructor");
	}
	public B(int i, int j) {
		super(j);
		System.out.println("Class B parameterised-Constructor two args");
	}
}
public class SuperInheritance {

	public static void main(String[] args) {
		/*
		 * when class B constructor is called new B()--> then A() & B() constructor is called.
		 */
		new B();
		System.out.println("\n\n");
		/*
		 * When Class constructor is called new B(int i) -->
		 * Then A() and B(i) constructor is called
		 */
		new B(5);
		System.out.println("\n\n");
		/*
		 * Now to call parameterised Constructor of A(i) use super(i)
		 */
		new B(6, 7);
	}

}
