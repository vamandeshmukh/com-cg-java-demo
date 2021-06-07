package com.cg.demo.ex;

import java.util.Scanner;

public class ExDemo {

	// robust - exception handling, garbage collection

	public static int divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1");
		int num1 = sc.nextInt();
		System.out.println("Enter 2");
		int num2 = sc.nextInt();
		try {
			return num1 / num2;
		} catch (ArithmeticException obj) {
			return 0; // business decision
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(ExDemo.divide());
		System.out.println("End");
	}
}
