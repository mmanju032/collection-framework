package com.manju.collection.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearning {

	public static void main(String[] args) {

		// FIFO
		// Queue using LinkedList Implementation
		Queue<String> queue1 = new LinkedList<>();
		queue1.offer("Manju");
		queue1.offer("Abhi");
		queue1.offer("Dinu");
		queue1.offer("Sri");

		System.out.println(queue1);

		System.out.println("peeked item: " + queue1.peek());
		System.out.println("element item: " + queue1.element());
		System.out.println(queue1);

		System.out.println("polled item: " + queue1.poll());
		System.out.println(queue1);

		// performing on empty queue
		queue1.clear();
		System.out.println("peeked item on empty queue: " + queue1.peek());
		System.out.println("peeked item on empty queue: " + queue1.poll());

		// java.util.NoSuchElementException
//		System.out.println("remove item on empty queue: " + queue1.remove());	

		// peeking using element
//		java.util.NoSuchElementException
//		System.out.println("element item on empty queue: " + queue1.element());

		// Priority Queue:
		// has MinHeap and MaxHeap implementation for setting up priority on the queue
		// items:

		Queue<Integer> queue2 = new PriorityQueue<>();
		queue2.offer(100);
		queue2.offer(10);
		queue2.offer(7);
		queue2.offer(1);
		queue2.offer(50);
		queue2.offer(3);
		queue2.offer(9);
		queue2.offer(4);

		System.out.println("priority queue - minHeap (default):");
		System.out.println(queue2);

		System.out.println("peek element: " + queue2.peek());
		System.out.println(queue2);
		System.out.println("poll element: " + queue2.poll());
		System.out.println(queue2);

		Queue<Integer> queue3 = new PriorityQueue<>(Collections.reverseOrder());
		queue3.offer(100);
		queue3.offer(10);
		queue3.offer(4);
		queue3.offer(7);
		queue3.offer(50);
		queue3.offer(150);
		queue3.offer(250);

		System.out.println("priority queue - maxHeap (using reverseOrder):");
		System.out.println(queue3);

		System.out.println("peek element queue3: " + queue3.peek());
		System.out.println(queue3);
		System.out.println("poll element queue3: " + queue3.poll());
		System.out.println(queue3);
		
		// queue using ArraDeque implementation:
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(10);
		adq.offerFirst(50);
		adq.offerLast(20);
		adq.offer(15);
		adq.offer(5);
		System.out.println(adq);
		
		System.out.println(adq.peekLast());
		System.out.println(adq.peekFirst());
		System.out.println(adq.element());
		
		System.out.println(adq);
		System.out.println(adq.getFirst());
		System.out.println(adq.getLast());
		
		//check empty queue:
		adq.clear();
		
		//returns null
		System.out.println("empty peeklast:" + adq.peekLast());
		System.out.println("empty peekfirst:" + adq.peekFirst());
		
		//java.util.NoSuchElementException
//		System.out.println("empty getFirst:" + adq.getFirst());
//		System.out.println("empty getLast:"+ adq.getLast());
		
	}

}
