package com.cg.demo;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		int num = 2;

		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Other value");
			break;
		}
		System.out.println("End");
	}

}
