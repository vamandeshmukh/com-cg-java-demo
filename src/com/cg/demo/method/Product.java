package com.cg.demo.method;

public class Product {

	long id;
	String name;
	double price;
	String description;

	void outputOfProduct() {
		System.out.println("Product is working...");
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Product(long id, String name, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}

}
