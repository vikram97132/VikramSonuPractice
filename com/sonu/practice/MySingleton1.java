package com.sonu.practice;

public class MySingleton1 {

//	Runtime r1 = Runtime.getRuntime();
//	Runtime r2 = Runtime.getRuntime();
//	Runtime r3 = Runtime.getRuntime();
//	Runtime r4 = Runtime.getRuntime();
// r1 to r4 all will refer to same object everytime same object return by jvm not new, becoz time an space benefit
	                                   
	private static MySingleton1 ms = new MySingleton1();
	
	private MySingleton1(){
		// private constructor so no one can create new object of this class into another class
	}
	public static MySingleton1 getSingleTon1() {
		// for every time getSingleton method called  will return same object
		return ms;
	}
//===============================================================================================//
	
	// second way
	
	private static MySingleton1 ms1 = null;
	private void MySingleton(){
		// private constructor so no one can create new object of this class into another class
	}
	public static MySingleton1 getSingleTon() {
		if(ms1==null) {
			ms1= new MySingleton1();
		}else {
		return ms;
		}
		return ms;
	}
	
	
	
	
	
}
