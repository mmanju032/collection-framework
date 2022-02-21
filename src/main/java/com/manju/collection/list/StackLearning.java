package com.manju.collection.list;

import java.util.Stack;

public class StackLearning {
	
	public static void main(String[] args) {
		
		//LIFO
		
		Stack<String> strStack = new Stack<>();
		strStack.add("Manju");
		strStack.push("Abhi");
		strStack.push("Dinu");
		strStack.push("Sri");
		
		System.out.println(strStack);
		System.out.println(strStack.peek());
		System.out.println(strStack);
		System.out.println(strStack.pop());
		System.out.println(strStack);
		
		System.out.println("size: "+ strStack.size());
		System.out.println("isEmpty ?  "+ strStack.isEmpty());
		System.out.println("contains ? " + strStack.contains("Abhi"));
		System.out.println("capacity : " + strStack.capacity());
		System.out.println("firstElement: " + strStack.firstElement());
		System.out.println("lastElement: " +strStack.lastElement());
		
		
		System.out.println(strStack.search("Sri"));
		System.out.println(strStack.search("Manju"));
		System.out.println(strStack.search("Dinu"));
		System.out.println(strStack.search("Abhi"));  // returns index of stack from last
		
	}

}
