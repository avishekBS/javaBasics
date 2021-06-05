package com.java.learn.basics.thread;

public class ThreadJoin {
	Runnable hiRunnable = () -> {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(1100);} catch (InterruptedException e) {}
		}
	};
	Runnable helloRunnable = () -> {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1100);} catch (InterruptedException e) {}
		}
	};
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin obj = new ThreadJoin();
		Thread hiThread = new Thread(obj.hiRunnable);
		Thread helloThread = new Thread(obj.helloRunnable);
		hiThread.start();
		helloThread.start();
		/*
		 * Bye will be printed before Thread "hiThread" and "helloThread" ends
		 * Main thread doesnt have any work to do after two new threads are created
		 * So we have to join both the thread to main thread before executing any further
		 */
		hiThread.join();
		helloThread.join();
		System.out.println("Bye from execution!!!!");
	}
}
