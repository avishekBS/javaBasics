package com.java.learn.basics.thread;

class Hi extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
class Hello extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		//hi.run(); --? overidden run method is called and executes normanlly
		//hello.run();
		hi.start();  // start will call run method from Runnable interface
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		hello.start();
	}

}
