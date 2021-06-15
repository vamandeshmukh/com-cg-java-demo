package com.cg.demo.misc;

public class SuperClass {
	
	private static final int num = 10;

	public void someMethod() {
		System.out.println("someMethod");
	}

	public final void finalMethod() {
		System.out.println("finalMethod");
	}
}
