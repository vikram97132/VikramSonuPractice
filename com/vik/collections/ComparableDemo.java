package com.vik.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sonu.practice.Student;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 3));
		students.add(new Student("Bob", 1));
		students.add(new Student("Charlie", 2));

		// comparable 
		Collections.sort(students); // Sorts based on natural ordering (id)
		for (Student student : students) {
			System.out.println(student.name + " - " + student.id);
		}
		
		// comparator
	}
}
