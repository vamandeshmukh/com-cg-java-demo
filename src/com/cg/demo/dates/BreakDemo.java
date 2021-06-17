package com.cg.demo.dates;

public class BreakDemo {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			if (i == 5)
				break;
		}
	}
}
