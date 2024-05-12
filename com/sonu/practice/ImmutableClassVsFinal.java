package com.sonu.practice;

public class ImmutableClassVsFinal {
	
	// Immutable vs Final concept 
	// final is about variable and immutable is about object both are diff
	public static void main(String[] args) {
		
		final StringBuffer sb = new StringBuffer("vikram");// by declaring reference variable as final we dont get immutability
		sb.append(" singh");
		System.out.println(sb);// value get appended means its not immutable
		// so we cant create stringbuffer immutable
	}

}
