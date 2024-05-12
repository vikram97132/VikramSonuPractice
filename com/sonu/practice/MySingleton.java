package com.sonu.practice;

public class MySingleton {

//	Runtime r1 = Runtime.getRuntime();
//	Runtime r2 = Runtime.getRuntime();
//	Runtime r3 = Runtime.getRuntime();
//	Runtime r4 = Runtime.getRuntime();
// r1 to r4 all will refer to same object everytime same object return by jvm not new, becoz time an space benefit
	                                   
	private static MySingleton ms = new MySingleton();
	
	private MySingleton(){
		// private constructor so no one can create new object of this class into another class
	}
	public static MySingleton getSingleTon() {
		// for every time getSingleton method called  will return same object
		return ms;
	}
//===============================================================================================//
	
	// second way
	
	private static MySingleton ms1 = null;
	private MySingleton(){
		// private constructor so no one can create new object of this class into another class
	}
	public static MySingleton getSingleTon() {
		if(ms1==null) {
			ms1= new MySingleton();
		}else {
		return ms;
		}
	}
	
	
	
	
	
}
