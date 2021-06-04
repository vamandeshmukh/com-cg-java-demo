package com.cg.demo.encap;

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
