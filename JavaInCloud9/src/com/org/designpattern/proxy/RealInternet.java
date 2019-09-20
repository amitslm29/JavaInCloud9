package com.org.designpattern.proxy;

public class RealInternet implements Internet {
	
	@Override
	public void connect(String serverHost) throws Exception {
		System.out.println("Connecting to : " + serverHost);
	}
}
