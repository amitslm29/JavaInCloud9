package com.org.designpattern.builder;

public class PhoneClient2 {
	
	public static void main(String[] args) {
		PhoneBuilderDirector director = new PhoneBuilderDirector();
		System.out.println(director.getBasicPhone());
		System.out.println(director.getPhoneWithCamera());
		System.out.println(director.getPhoneWithCameraWIthBigScreen());
	}
}
