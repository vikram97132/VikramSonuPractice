package com.sonu.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeData {
	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "AnilSaxena", "IT", 25000, "Delhi"));
		emp.add(new Employee(2, "PramodSingh", "IT", 26000, "Noida"));
		emp.add(new Employee(3, "NileshSingh", "HR", 25500, "Mumbai"));
		emp.add(new Employee(4, "BharatSingh", "Account", 22000, "Gurugram"));
		emp.add(new Employee(5, "Saritagupta", "HR", 24500, "Delhi"));
		emp.add(new Employee(6, "MamtaSehgal", "Java", 29000, "Chandigarh"));
		emp.add(new Employee(7, "PrakharSahu", "Java", 29500, "Chennai"));

		//store in hashmap and rtrive data on id  basis
		HashMap<Integer, Employee> empMap = new HashMap();

		for (Employee e : emp) {
			empMap.put(e.getEmpId(), e);
		}
		System.out.println(empMap.get(5));

		// find emp name only, salary more than 26000
		List<String> list = emp.stream().filter(e -> e.getSalary() > 25000).map(e -> e.getName())
				.collect(Collectors.toList());

		Collections.sort(emp, Comparator.comparing(Employee::getSalary).reversed());

		// Print the sorted list
		for (Employee e : emp) {
			// System.out.println(e.toString());
		}

	}
}
