package com.java.learn.basics.lamda;

public class MethodReferenceLamda {
	
	public static void main(String[] args) {
		// This process can call instance of a method which is nonstatic.
		Thread thread = new Thread(()->printHello());
		thread.start();
		
		/*instead of this we can do method reference
		 * which is doen only for Static methods.
		 */
		Thread t1 = new Thread(MethodReferenceLamda::printHello);
		t1.start();
	}
	public static void printHello() {
		System.out.println("hello thread");
	}

}
