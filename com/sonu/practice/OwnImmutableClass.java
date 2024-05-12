package com.sonu.practice;

final public class OwnImmutableClass {
	// immutable means no change in object allowed, if their is no change in object same will be returned
	// if changes new object wil be created
	private int i;
	public OwnImmutableClass(int i) {
		this.i=i;
	}
	public OwnImmutableClass modify(int i) {
		if(this.i==i) {
			return this;
		}else {
			return new OwnImmutableClass(i);
		}
		
	}
	public static void main(String[] args) {
		OwnImmutableClass t1 = new OwnImmutableClass(10);
		OwnImmutableClass t2 = t1.modify(100);
		OwnImmutableClass t3 = t1.modify(10);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
	
	

}
