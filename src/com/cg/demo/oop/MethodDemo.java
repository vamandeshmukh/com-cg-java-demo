package com.cg.demo.oop;

// return types of methods 

public class MethodDemo {

//	returnType methodName(arguments) {
//       	statements;
//} 

	static void someMethodName() {
		System.out.println("Some output");
	}

	static void addTwoNumbers(int num1, int num2) { // parameters (variables in method signature)
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {

		System.out.println("Start");

//		someMethodName();
//		someMethodName(10, 20);

		addTwoNumbers(10, 20); // arguments (values in method call)
		addTwoNumbers(5, 5);
		addTwoNumbers(15, 25);
//		addTwoNumbers(10.5, 20.5);		
//		addTwoNumbers(10, 20, 30);
//		addTwoNumbers(10);
//		addTwoNumbers();
	}
}
