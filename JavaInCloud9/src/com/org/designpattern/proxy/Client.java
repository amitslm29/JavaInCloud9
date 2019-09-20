package com.org.designpattern.proxy;

public class Client {
	public static void main(String[] args) {
		Internet internet = new ProxyInternet(); 
		try { 
			internet.connect("geeksforgeeks.org"); 
			internet.connect("abc.com"); 
		} 
		catch (Exception e) { 
			System.out.println(e.getMessage()); 
		} 
	}
}
