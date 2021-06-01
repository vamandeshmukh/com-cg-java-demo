package com.cg.demo;

/*
 * Data types in java 
 * 
 * Primitives data types - (store single value)
 * byte short int long (integer values) (how many)
 * float double (decimal point values / floating point values) (how much)
 * char (character value / integer value)
 * boolean (true / false)
 * 
 * Reference data types - (store multiple values)
 * array, String, class, interface, enum, ...  
 * 
 */

public class DataTypesDemo {

	public static void main(String[] args) {

		byte b1 = -128; // -128 to 127
		System.out.println(b1);
		int num = Integer.MAX_VALUE; // 2147483647
		int num2 = Integer.MIN_VALUE; // -2147483648
		System.out.println(num);
		System.out.println(num2);

		byte b2 = Byte.MAX_VALUE;

		long biggestIntegerInJava = Long.MAX_VALUE; // 9223372036854775807
		System.out.println("biggestIntegerInJava " + biggestIntegerInJava);

		long phone = 9876543210L;
		System.out.println(phone);

		String PAN_CARD = "ABCDE1234E";
	}
}

