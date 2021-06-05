package com.java.learn.basics;
class Example1
{
	public void show() {
		System.out.println("Class A show() called");
	}
	public void print() {
		System.out.println("Class A print() called");
	}
}
class Example2 extends Example1{
	@Override
	public void show() {
		System.out.println("Class B show() called");
	}
	public void config() {
		System.out.println("Class B config() called");
	}
}
class Example3 extends Example1{
	@Override
	public void show() {
		System.out.println("Class C show() called");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		/*
		 * Reference type is Example1 while object created example2
		 */
		System.out.println("Method Overiding:");
		Example2 example1 = new Example2(); //Method Overriding
		example1.show();
		
		System.out.println("\n\nPloymorphism: ");
		Example1 example2 = new Example2();  // Runtime Polymorphism
		example2.print(); // when method not overriden calls parent
		example2.show(); // when method not overriden calls child
		//example2.config(); --> method child cant be called as reference type is parent & method not present in parent
		
		example2 = new Example3();
		example2.show(); //dynamic method dispatch
		
		/*
		 * what we learn here:
		 * 1. Reference type method is only called, object class method is not called
		 * 2. If Method is overridden then object class is called
		 * 3. 
		 */
		
		
	}

}
