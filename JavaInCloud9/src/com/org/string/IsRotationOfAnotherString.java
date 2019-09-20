package com.org.string;

public class IsRotationOfAnotherString {

	public static void main(String[] args) {

		/*
		 * If s1 = "stackoverflow" then the following are some of its rotated versions:
		 * tackoverflows
		 * ackoverflowst
		 * ackoverflowst
		 * where as "stackoverflwo" is not a rotated version.
		 */
		String str1 = "stackoverflow";
		String str2 = "tackoverflows";
		String str3 = "stackoverflwo";
		System.out.println("str2 is a rotation version of str1: " + isRotation(str1, str2));
		System.out.println("str3 is a rotation version of str1: " + isRotation(str1, str3));
	}

	public static boolean isRotation(String s1, String s2) {
		if(!(s1.length() == s2.length()))
			return false;
		if(s1.concat(s1).contains(s2))
			return true;
		return false;
	}

}
