package com.org.designpattern.builder;

public class PhoneBuilderDirector {

	public Phone getBasicPhone() {
		return new Phone.PhoneBuilder(10000, "ANDROID").build();
	}

	public Phone getPhoneWithCamera() {
		return new Phone.PhoneBuilder(10000, "ANDROID")
				.setCamera("32MP").build();
	}

	public Phone getPhoneWithCameraWIthBigScreen() {
		return new Phone.PhoneBuilder(10000, "ANDROID").setCamera("32MP")
				.setScreensize(4.10).build();
	}

}
