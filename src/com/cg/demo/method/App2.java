package com.cg.demo.method;

public class App2 {

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.id = 1457854L;
		p1.name = "OnePlus Phone";
		p1.price = 50000;
		p1.description = "It's a good phone.";
		System.out.println(p1.toString());

		Product p2 = new Product(457896325, "Bose Speakers");
		System.out.println(p2.toString());

		Product p3 = new Product(71202458, "MS Surface Pro", 135000, "Stunning graphics!");
		System.out.println(p3.toString());

		Product p4 = new Product(4578625, "Apple TV", 125000, "Nice TV.");
		System.out.println(p4.toString());

	}

}
