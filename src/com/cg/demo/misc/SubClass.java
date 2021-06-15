package com.cg.demo.misc;

public class SubClass extends SuperClass {

	@Override
	public void someMethod() {
		System.out.println("Overridden someMethod");
	}

// //	Cannot override the final method from SuperClass
//	@Override
////	public void finalMethod() {
//	public final void finalMethod() {
//		System.out.println("Overridden finalMethod");
//	}

}
