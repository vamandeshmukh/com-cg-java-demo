package com.cg.demo.str;

/*
 * • Convert number into String 
• Extract each char using charAt method 
• Convert char to int and find the difference 
• Create new StringBuffer object and keep adding the difference 
• Finally convert StringBuffer to int

 */

public class Ex2Lab {

	public static int modifyNumber(int num) {
		String str = Integer.toString(num);
		int rem = 0;

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length() - 1; i++) {
			int temp = str.charAt(i + 1) - str.charAt(i);
			sb.append(Math.abs(temp));
		}
		if (str.length() % 2 != 0) {
			rem = num % 10;
		}
		sb.append(rem);
//		sb.append(sb.charAt(str.length() - 1));
		int n = Integer.parseInt(sb.toString());
		return n;
	}

	public static void main(String[] args) {

		int input = 457965;
		System.out.println(input);
		System.out.println(Ex2Lab.modifyNumber(input));

//		String str = Integer.toString(input);
//		StringBuffer output = new StringBuffer();
//
//		System.out.println(str);
//		for (int i = 0; i < str.length(); i++) {
//			int num = str.charAt(i) - str.charAt(i + 1);
//			output.append(num);
//		}
//		int finalOutput = Integer.parseInt(output.toString());
//		System.out.println(finalOutput);

	}

}
