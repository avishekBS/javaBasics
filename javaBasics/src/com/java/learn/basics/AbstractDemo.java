package com.java.learn.basics;

abstract class Human{
	public abstract void eat(); // abstract method can be declared inside abstract class only
	public void sleep() {
		System.out.println("sleep() from abstract/parent class");
	}
}
abstract class Dog extends Human{ //abstract class can extend non-abstract class too.
	
}

public class AbstractDemo extends Human{
	public static void main(String[] args) {
		Human human = new AbstractDemo();
		human.sleep(); // use abstract class method using ref as abstract/parent and obj and child
		human.eat();
		AbstractDemo demo = new AbstractDemo();
		demo.poop();
	}
	// you have to override and abstract parent class abstract methods
	@Override
	public void eat() {
		System.out.println("eat() from child class");
	}
	// not mandatory to extend non abstract method
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("sleep() from child class");
	}
	public void poop() {
		System.out.println("poop() from this class");
	}
}
