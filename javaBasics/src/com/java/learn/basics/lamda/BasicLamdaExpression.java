package com.java.learn.basics.lamda;

public class BasicLamdaExpression {

	public static void main(String[] args) {
		BasicLamdaExpression example = new BasicLamdaExpression();
		
		
		/*
		 * Using impl class 
		 */
		Greet greet = new GreetImpl();
		example.geetings(greet);
		
		
		/*
		 * Anonymous class
		 */
		
		Greet greetImpl = new Greet() {
			
			@Override
			public void sayHello() {
				System.out.println("hellow from anonoyous class....");
			}
		};
		example.geetings(greetImpl);
		
		
		/*
		 * Using lamda function
		 *  shortcut to create lamda function:
		 *  1. remove public void methodname
		 *  2. if only one method signature the remove ( ) just use a->a;
		 *  3. remove { }  if only one line of code
		 *  4. remove return as the return type will be found in functional interface
		 */
		Greet greetLamda = () -> System.out.println("from lamda function");
		example.geetings(greetLamda);
	}
	
	public  void geetings(Greet greet) {
		greet.sayHello();
	}
}
interface Greet{
	void sayHello();
}

class GreetImpl implements Greet{

	@Override
	public void sayHello() {
		System.out.println("Hello you are using java 7 way to call interface");
	}
	
}