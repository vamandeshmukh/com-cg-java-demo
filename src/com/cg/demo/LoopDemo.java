package com.cg.demo;

public class LoopDemo {

	// while loop - 0 or more times 
	// do while loop - 1 or more times 
	
	
	public static void main(String[] args) {
		System.out.println("Start");

		int num = 10;

		while (num < 10) { // 2, 3, false
			System.out.println(num); // 1, 2, 3 ... 10
			num++; // 2, 3, ... 11
		}
		System.out.println("End");

	}

}
