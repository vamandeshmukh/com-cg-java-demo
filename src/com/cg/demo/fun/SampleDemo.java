package com.cg.demo.fun;

//public class SampleDemo implements SampleInterface {

//
//	public static void main(String[] args) {
//
//		SampleDemo obj = new SampleDemo();
//		obj.aDefaultMethod();
//		obj.anotherDefaultMethod();
//
//		obj.anAbstractMethod();
//		obj.anotherAbstractMethod();
//
//		SampleInterface.aStaticMethod();
//		SampleInterface.anotherStaticMethod();
//
//	}
//
//	@Override
//	public void anAbstractMethod() {
//		System.out.println("anAbstractMethod");
//	}
//
//	@Override
//	public void anotherAbstractMethod() {
//		System.out.println("anotherAbstractMethod");
//	}
//
//}

public class SampleDemo {

	public static void main(String[] args) {

		SampleInterface obj = new SampleInterface() {

			@Override
			public void anAbstractMethod() {
				System.out.println("anAbstractMethod");
			}

			@Override
			public void anotherAbstractMethod() {
				System.out.println("anotherAbstractMethod");
			}
		};
		obj.anAbstractMethod();
		obj.anotherAbstractMethod();
		obj.aDefaultMethod();
		obj.anotherDefaultMethod();
		SampleInterface.aStaticMethod();
		SampleInterface.anotherStaticMethod();

	}

}
