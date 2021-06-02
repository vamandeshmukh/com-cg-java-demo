package com.cg.demo;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter elements:");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
