package com.java.learn.basics.collection;

import java.util.*;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("mukul");
		System.out.println("After declaration & insertion --> " + deque);
		deque.offerFirst("avishek");
		System.out.println("offerFirst --> " + deque);
		deque.pollLast();
		System.out.println("AFter poll last --> " + deque);
		
		Iterator<String> descendingIterator = deque.descendingIterator();
		while (descendingIterator.hasNext())
			System.out.println(descendingIterator.next());
	}
}
