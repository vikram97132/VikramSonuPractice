package com.vik.collections;

public class Employee implements Comparable<Employee> {
	String name;
	String lastName;
	Integer age;

	public Employee(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee anotherEmp) {
		//sorting based on for int value 
		if (this.getAge() > anotherEmp.getAge()) {
			return +1;
		}
		if (this.getAge() < anotherEmp.getAge()) {
			return -1;
		}
		return 0;
		
		
		// soring based on string value , as string already implemented compareTo , so no need to write
		// custom logic
		
		//return this.getName().compareTo(anotherEmp.getName());
		// for reverse    return -this.getName().compareTo(anotherEmp.getName());
	}

}
