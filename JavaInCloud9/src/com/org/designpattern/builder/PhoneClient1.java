package com.org.designpattern.builder;

public class PhoneClient1 {

	public static void main(String[] args) {
		
		//Basic Phone
		Phone phone1 = new Phone.PhoneBuilder(10000, "ANDROID").build();
		System.out.println(phone1);
		
		//Phone with 32 Mega pixel Camera
		Phone phone2 = new Phone.PhoneBuilder(10000, "ANDROID")
				.setCamera("32MP").build();
		System.out.println(phone2);
		
		//Phone with 32 Mega pixel Camera and Big Screen Size
		Phone phone3 = new Phone.PhoneBuilder(10000, "ANDROID")
				.setCamera("32MP").setScreensize(4.10).build();
		System.out.println(phone3);
	}
}
