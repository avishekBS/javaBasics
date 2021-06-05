package com.java.learn.basics.thread;

class HiRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
class HelloRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		Runnable hi = new HiRunnable();
		Runnable hello = new HelloRunnable();
		// hi.run(); --? overidden run method is called and executes normanlly
		// hello.run();
		/*
		 * This code is for extends thread hi.start(); // start will call run method
		 * from Runnable interface try {Thread.sleep(1000);} catch (InterruptedException
		 * e) {} hello.start();
		 */
		Thread threadHi = new Thread(hi);// --> pass obj of runnable.
		Thread threadHello = new Thread(hello);
		threadHi.start(); //--> This is obj of thread so call start
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		threadHello.start();
		
		/*
		 * Thread defines the declared method of interface
		 */
	}
}
