package com.cg.demo.col;

import java.util.ArrayList;

public class ColDemo {

	public static void main(String[] args) {

		int[] numArray = new int[5];

		int[] arr = { 10, 20, 30, 40, 50 }; // not growable not shrinkable
//
//		System.out.println(arr.length);
//
//		for (int i : arr) {
//			System.out.println(i);
//		}

//		List Set Map Queue 

		ArrayList myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(20.75);
		myList.add("Abc");
		System.out.println(myList.size());
		System.out.println(myList);
	}

}
