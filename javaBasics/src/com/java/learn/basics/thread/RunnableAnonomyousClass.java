package com.java.learn.basics.thread;

public class RunnableAnonomyousClass {
	Runnable hiObj = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(900);} catch (InterruptedException e) {}
			}
		}
	};
	Runnable helloObj = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(1100);} catch (InterruptedException e) {}
			}
		}
	};
	public static void main(String[] args) {
		RunnableAnonomyousClass obj = new RunnableAnonomyousClass();
		Thread hiThread = new Thread(obj.hiObj);
		Thread helloThread = new Thread(obj.helloObj);
		hiThread.start();
		helloThread.start();
	}
}
