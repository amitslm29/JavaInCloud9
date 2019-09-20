package com.org.gc;

public class IslandOfIsloationDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();  
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.i = s2;
		s2.i = s3;
		s3.i = s1;
		
		s1 = null;
		s2 = null;
		s3 = null;
		
	}
}


