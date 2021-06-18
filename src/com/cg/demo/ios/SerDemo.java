package com.cg.demo.ios;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();

		Employee emp = new Employee(id, name, salary);
		System.out.println(emp.toString());

		String file = "emp.ser";

		FileOutputStream fos = new FileOutputStream(file);

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp);

		System.out.println("Done");
		oos.close();
		sc.close();

	}

}
