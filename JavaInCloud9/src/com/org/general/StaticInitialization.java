package com.org.general;

public class StaticInitialization {
	
	static String companyName;
	
	static {
		if(true) {
			companyName = "SEARS"; 
		}else {
			companyName = "WIPRO"; 
		}
	}
}
