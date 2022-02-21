package com.manju.collection.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaLearning {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1,"Manju"));
		students.add(new Student(2,"Abhi"));
		students.add(new Student(3,"Sri"));
		students.add(new Student(4,"Dinu"));
		students.add(new Student(2,"Dup"));
		students.add(new Student(6,"Diya"));
		
		System.out.println(students);
		
		//iterate each item:
		students.forEach(i-> System.out.print(i+ " "));
		
		//filter students whose name starts with letter 'D'
		System.out.println("********************************");
		students.stream().filter( s-> s.getName().startsWith("D")).
		forEach(s-> System.out.println(s.getName()));

		
		//count no of students whose name starts with letter 'D'
		System.out.println("********************************");
		System.out.println("Count of D students: " +
				students.stream().filter( s-> s.getName().startsWith("D")).count());
		
		//count no of students whose name starts with letter 'D'
		System.out.println("********************************");
		List<Student> filterdStudents = 
				students.stream().filter( s-> s.getName().startsWith("D")).
				collect(Collectors.toList());
		System.out.println("List of students with name starts with D: " + filterdStudents);
		
		
		//filter with sort
		List<Student> sorted = 
				students.stream().
				filter( s-> s.getName().startsWith("D")).
				sorted((s1,s2) -> s1.getId() - s2.getId()).
				collect(Collectors.toList());
		System.out.println("List of sorted students with name starts with D: " + sorted);
		
		//filter with sort and findfirst
		System.out.println("findfirst:" +
						students.stream().
						filter( s-> s.getName().startsWith("D")).
						sorted((s1,s2) -> s2.getId() - s1.getId()).findFirst());
		
		System.out.println();
		
		
		System.out.println("Anymatch--> " +
              students.stream().anyMatch(s-> s.getName().startsWith("M")));
		
		System.out.println("Allmatch--> " +
	              students.stream().allMatch(s-> s.getName().startsWith("M")));
		
		System.out.println("distinct students:::");
		students.stream().distinct().
				forEach(System.out::print);
		System.out.println();
		
		//Integer Stream:
		
		//Integer stream with Range
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		
		//Integer stream with Range and skip
		IntStream.range(1, 10).
		skip(5).
		forEach(System.out::print);
		System.out.println();
		
		//Integer stream with Range and skip
		System.out.println("sum:" + IntStream.range(1, 10).
			skip(5).sum());
		
		
		//Average of sqaure
		System.out.println("Average of square:");
		Arrays.stream(new int[] {1,2,5,6,8,9,20}).map(x -> x*x).average().ifPresent(System.out::print);
		
		System.out.println();
		System.out.println("sum of square: " +
		Arrays.stream(new int[] {1,2,5,6,8,9,20}).map(x -> x*x).sum());
		
		
		
		

		

	}

}
