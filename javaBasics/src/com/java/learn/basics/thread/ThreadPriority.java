package com.java.learn.basics.thread;

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
		Thread hiThread = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + "-" +Thread.currentThread().getPriority());
				try {Thread.sleep(1100);} catch (InterruptedException e) {}
			}
		}, "Hi-Thread"); // One way set name using new thread constructor
		Thread helloThread = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + "-" +Thread.currentThread().getPriority());
				try {Thread.sleep(1100);} catch (InterruptedException e) {}
			}
		}, "Hello-Thread"); // One way set name using new thread constructor\
		hiThread.setPriority(Thread.MIN_PRIORITY);
		helloThread.setPriority(Thread.MAX_PRIORITY); // by default priority is 5. 1 being the lowest and 10 the highest
		hiThread.start();
		helloThread.start();
	
		hiThread.join();
		helloThread.join();
		System.out.println("thread name:"+hiThread.getName());
		System.out.println("thread name:"+helloThread.getName());
		System.out.println("Bye from execution!!!!");
	}
}
