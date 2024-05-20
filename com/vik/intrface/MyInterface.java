package com.vik.intrface;

public interface MyInterface {
	public abstract void abstractMethod();
	
	public default void defaultMethod() {
		System.out.println("defult method from myinterface");
	}
	public static void staticMethod() {
		System.out.println("static method from myinterface");
	}

}
