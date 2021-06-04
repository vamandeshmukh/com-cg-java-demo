package com.cg.demo.encap;

class Phone {

	void call() {
		System.out.println("Calling...");
	}

	void sms() {
		System.out.println("Sending SMS...");
	}

}

public class PhoneDemo {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.call();
		phone.sms();

	}

}
