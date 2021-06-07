package com.cg.demo.labs;

import java.util.Scanner;

public class Ex7 {

	public boolean checkNumber(int number) {

		String str = Integer.toString(number);

		boolean isIncreasingNumber = false;

		for (int i = 0; i < str.length() - 1; i++) { // 123654 103456789 1233456 - Yes <= No <

			if (str.charAt(i) < str.charAt(i + 1)) {
				isIncreasingNumber = true;
			} else {
				isIncreasingNumber = false;
				break;
			}
		}
		return isIncreasingNumber;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");

//		int num = 12345789;
//		int num = 789562548;  
//		int num = 12345782;  

		int num = sc.nextInt();

		sc.close();

	}
}
