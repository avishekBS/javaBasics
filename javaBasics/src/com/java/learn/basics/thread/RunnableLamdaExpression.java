package com.java.learn.basics.thread;

public class RunnableLamdaExpression {
	/*
	 * Runnable is a Functional cLass so we can use lamda Expression instead of
	 * Anonomyous class.
	 */
//Remove new Runnable (){ public void run() and replace with () ->
	Runnable hiRunnable = () -> {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(1100);} catch (InterruptedException e) {}
		}
	};
	//ALternate way is to define the same in Thread
	/*Runnable helloRunnable = () -> {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1100);} catch (InterruptedException e) {}
		}
	};*/
	public static void main(String[] args) {
		RunnableLamdaExpression obj = new RunnableLamdaExpression();
		Thread hiThread = new Thread(obj.hiRunnable);
		Thread helloThread = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(1100);} catch (InterruptedException e) {}
			}
		});
		hiThread.start();
		helloThread.start();
	}
}
