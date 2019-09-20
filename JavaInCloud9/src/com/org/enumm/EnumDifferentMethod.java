package com.org.enumm;

enum Month {
	JAN, FEB, MAR, APR, MAY, JUN;
}

/*
 * values(), ordinal(), valueof()
 */
public class EnumDifferentMethod {
	
	public static void main(String[] args) {
		Month[] months = Month.values();
		for(Month month : months) {
			System.out.println(month + " at index " + month.ordinal());
		}
		System.out.println(Month.valueOf("FEB"));
	}
}
