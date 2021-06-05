package com.java.learn.basics;

class Parent {
	public void doSomething() {
		System.out.println("doing from Parent class");
	}
}

interface ParentInterface {
	void dotask();
}

public class AnonymousClassDemo extends Parent {
	public static void main(String[] args) {

		// With multiple inheretance Parent parent = new Parent() { };
		Parent parent = new Parent() {
			public void doSomething() {
				System.out.println("doing normal extends from AnonymousClassDemo class");
			}
		};
		// With Interface
		ParentInterface parentInterface = new ParentInterface() {

			@Override
			public void dotask() {
				System.out.println("doing interface implements from AnonymousClassDemo class");
			}
		};
		parent.doSomething();
		parentInterface.dotask();
	}
}
