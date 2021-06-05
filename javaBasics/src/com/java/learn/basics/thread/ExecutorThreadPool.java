package com.java.learn.basics.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java.learn.basics.SuperInheritance;

public class ExecutorThreadPool {
	int counter =0;
	public static void main(String[] args) {
		ExecutorThreadPool obj = new ExecutorThreadPool();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i <= 20000; i++) {
			executor.execute(() -> {
				System.out.println(Thread.currentThread().getName() + "::message="+(obj.counter++));
			});
		}
		executor.shutdown();
		while (!executor.isTerminated()) {}
		System.out.println("All Done!!");
	}
}
