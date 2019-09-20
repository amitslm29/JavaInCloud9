package com.org.collection;

public class ToStringOverrideDemo {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Raj","lucknow");  
		Student s2 = new Student(102,"Vijay","ghaziabad");
		System.out.println(s1);
		System.out.println(s2);
	}
}

class Student {
	int rollno;  
	String name;  
	String city;  

	Student(int rollno, String name, String city){  
		this.rollno=rollno;  
		this.name=name;  
		this.city=city;  
	}  
	
	public String toString(){
		return rollno + " " + name + " " + city;  
	}  

}


/*class Student {
	int rollno;  
	String name;  
	String city;  

	Student(int rollno, String name, String city){  
		this.rollno=rollno;  
		this.name=name;  
		this.city=city;  
	}  
}*/