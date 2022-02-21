package com.manju.collection.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

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
		
		List<Student> filterdStudents = new ArrayList<>();
		System.out.println("Count of D students: " +
				students.stream().filter( s-> s.getName().startsWith("D")).
				collect((Collector<? super Student, A, R>) filterdStudents));
		
		

		

	}

}
