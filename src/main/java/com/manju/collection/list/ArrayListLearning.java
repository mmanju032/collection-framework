package com.manju.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListLearning {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(5);
		intList.add(50);
		intList.add(20);
		intList.add(10);

		System.out.println(intList);

		// add an item at specifix index
		intList.add(2, 100);
		System.out.println(intList);

		// add duplicate items
		intList.add(100);
		intList.add(100);
		intList.add(100);

		// remove an item using index and value
		intList.remove(Integer.valueOf(20));
		intList.remove(0);
		System.out.println(intList);

		List<Integer> otherList = new ArrayList<>();
		otherList.add(3);
		otherList.add(6);
		otherList.add(9);
		otherList.add(12);

		// add other list
		intList.addAll(otherList);
		System.out.println(intList);

		// check for an item
		System.out.println("List contains 100 ? " + intList.contains(100));
		System.out.println("List contains 500 ? " + intList.contains(500));

		// check for empty
		System.out.println("List empty ? " + intList.isEmpty());

		// List Size
		System.out.println("List Size is : " + intList.size());

		// get particular item
		System.out.println("Fist element is : " + intList.get(0));

		// index of
		System.out.println("Index of 100 is : " + intList.indexOf(100));
		System.out.println("Last Index of 100 is : " + intList.lastIndexOf(100));

		// Iterating using Java 7
		System.out.println("Iterating using traditional for loop");
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + " ");
		}
		System.out.println();
		System.out.println("Iterating using for in loop");
		for (int i : intList) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Iterating using Iterator");
		Iterator<Integer> it = intList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		// Iterating using Java 8
		System.out.println();
		System.out.println("Iterating using forEach java8");
		intList.forEach(i -> System.out.print(i + " "));
		
//		System.out.println();
//		System.out.println("Filter odd numbers");
//		intList.stream().filter(i -> i%2> 0).forEach(i -> System.out.print(i + " "));
//		
//		System.out.println();
//		System.out.println("Filter even numbers");
//		intList.stream().filter(i -> i%2 ==0).forEach(i -> System.out.print(i + " "));
//		
//		System.out.println();
//		System.out.println("sort the list");
//		Collections.sort(intList);
//		System.out.println(intList);
		
		//Update an existing value
		intList.set(0, 2);
		System.out.println();
		System.out.println("Update an existing value");
		System.out.println(intList);

	}

}
