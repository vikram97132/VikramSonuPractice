package com.sonu.practice;


public class Student implements Comparable<Student> {
	public String name;
	public int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.id, other.id);
	}
}