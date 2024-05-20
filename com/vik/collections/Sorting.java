package com.vik.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vik.utilitymethods.MyUtility;

public class Sorting {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList();

		intList.add(8);
		intList.add(5);
		intList.add(7);
		intList.add(2);

		//Collections.sort(intList);
		//MyUtility.iterateList(intList);
		
		
		List<String> stringList = new ArrayList();

		stringList.add("som");
		stringList.add("sanjay");
		stringList.add("akash");
		stringList.add("gyanendra");
		
		//Collections.sort(stringList);
		//MyUtility.iterateList(stringList);
		
		List<Employee> empList = new ArrayList();
		empList.add(new Employee("anil","aingh",22));
		empList.add(new Employee("neel","singh",25));
		empList.add(new Employee("pahal","cingh",23));
		empList.add(new Employee("krishan","gingh",21));
		empList.add(new Employee("mohan","hingh",20));
		
		Collections.sort(empList);
		//System.out.println("Sorting based on Age of Employee...");// compareTo logic written in employee class
		//MyUtility.iterateList(empList);
		
		// sorting by comparator age bases
		//Collections.sort(empList, new SortingByAgeComparator());
		//MyUtility.iterateList(empList);
		
		// soring by comparator lastname bases
		Collections.sort(empList, new SortingByLastNameComparator());
		MyUtility.iterateList(empList);

	}

}
