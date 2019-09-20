package com.org.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemoFirst {
	
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("Rohit");
		System.out.println(s);
		p.setProperty("Bhupati", "400");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "Updated by Amit on 10th May 2018");
	}

}
