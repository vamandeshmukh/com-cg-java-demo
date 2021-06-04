package com.cg.demo.encap;


class FeaturePhone extends Phone { // child class / sub class

	void music() {
		System.out.println("Playing music...");
	}
}

class SmartPhone extends FeaturePhone {

	void camera() {
		System.out.println("Snap pics...");
	}
}

public class PhoneDemo {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.call();
		phone.sms();
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.music();
		featurePhone.call();
		featurePhone.sms();
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.camera();
		smartPhone.call();
		smartPhone.sms();
		smartPhone.music();

	}
}
