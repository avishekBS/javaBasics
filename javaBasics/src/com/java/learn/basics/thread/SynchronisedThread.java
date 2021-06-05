package com.java.learn.basics.thread;
class SyncDemo{
	int counterNoSync;
	int counterSync;
	public void incrementNoSync() {
		counterNoSync++;
	}
	public synchronized void incrementSync() {
		counterSync++;
	}
}
public class SynchronisedThread {
	SyncDemo syncDemo = new  SyncDemo();
	Thread threadNoSync1 = new Thread(() -> {
		for (int i = 0; i < 1000; i++) {
			syncDemo.incrementNoSync();
		}
	});
	Thread threadNoSync2 = new Thread(() -> {
		for (int i = 0; i < 1000; i++) {
			syncDemo.incrementNoSync();
		}
	});
	
	Thread threadSync1 = new Thread(() -> {
		for (int i = 0; i < 1000; i++) {
			syncDemo.incrementSync();
		}
	});
	Thread threadSync2 = new Thread(() -> {
		for (int i = 0; i < 1000; i++) {
			syncDemo.incrementSync();
		}
	});
	public static void main(String[] args) throws InterruptedException {
		SyncDemo syncDemo = new  SyncDemo();
		SynchronisedThread syncObj = new SynchronisedThread();
		syncObj.threadNoSync1.start();
		syncObj.threadNoSync2.start();
		syncObj.threadNoSync1.join();
		syncObj.threadNoSync2.join();
		System.out.println("No sync counter value this may be less than 2000 sometimes due to collion of threads:"+ syncObj.syncDemo.counterNoSync);
		
		// Make method synchronized to make contol collion by threads.
		syncObj.threadSync1.start();
		syncObj.threadSync2.start();
		syncObj.threadSync1.join();
		syncObj.threadSync2.join();
		System.out.println("sysnchronized method will not allow two thread to use same method at sametime:"+ syncObj.syncDemo.counterSync);
	}
}
