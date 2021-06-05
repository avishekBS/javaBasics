package com.java.learn.basics.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("After declaration & insertion --> "+queue);
		System.out.println("[Peek FIFO -->"+queue.peek()+ "] [Element FIFO -->"+queue.element()+"]");  
		queue.remove(); //queue.poll()
		System.out.println("After Removing head as FIFO --> "+queue);
	}
}
