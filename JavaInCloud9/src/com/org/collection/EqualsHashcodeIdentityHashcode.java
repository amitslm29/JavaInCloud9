package com.org.collection;

public class EqualsHashcodeIdentityHashcode {
	public static void main(String[] args) {
		EmployeeIH emp = new EmployeeIH(23); // 23
		System.out.println(emp.hashCode()); // 705927765
		System.out.println(System.identityHashCode(emp));
	}
}

class EmployeeIH {
	private int age;
	public EmployeeIH( int age ){
		super();
		this.age = age;
	}
	public int hashCode(){
		return age;
	}
}

