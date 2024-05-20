package com.vik.utilitymethods;

import java.util.ArrayList;
import java.util.List;

public class MyUtility {
	
// creating generic methods
	
	public static<T> void iterateList(List<T> anyList) {
		for(T list : anyList ) {
			System.out.println(list);
		}
	}
	
}
