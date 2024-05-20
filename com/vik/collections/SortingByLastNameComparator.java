package com.vik.collections;

import java.util.Comparator;

public class SortingByLastNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}

}
