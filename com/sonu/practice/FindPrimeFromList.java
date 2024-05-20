package com.sonu.practice;

import java.util.Arrays;
import java.util.List;

public class FindPrimeFromList {
	boolean primeNum = true;

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		boolean isPrime = true;
		
		for(int i=1;i<numbers.size();i++) {
			if(i>1 && i/1==i && i%i==0 ) {
				System.out.println(i + "is a prime number");
			}else {
				System.out.println(i + "not prime number");
			}
		}

	}

}
