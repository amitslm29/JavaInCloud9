package com.org.collection;

import java.util.HashSet;

public class EqualsHashcodeOverrideHashset {
	
	public static void main(String[] args) {
		EmployeeHS emp1 = new EmployeeHS(23);
		EmployeeHS emp2 = new EmployeeHS(24);
		EmployeeHS emp3 = new EmployeeHS(24);
		EmployeeHS emp4 = new EmployeeHS(26);
		EmployeeHS emp5 = new EmployeeHS(26);
		
		HashSet<EmployeeHS> hs = new HashSet<EmployeeHS>();
		System.out.println(hs.add(emp1)); // true
		System.out.println(hs.add(emp2)); // true
		System.out.println(hs.add(emp3)); // false
		System.out.println(hs.add(emp4)); // true
		System.out.println(hs.add(emp5)); // false
		
		System.out.println("HashSet Size : "+ hs.size());
	}
	
}

class EmployeeHS {
	private int age ;
	public EmployeeHS( int age ){
		super();
		this.age = age;
	}

	public boolean equals( Object obj ){
		boolean flag = false;
		EmployeeHS emp = (EmployeeHS) obj;
		if( emp.age == age )
			flag = true;
		return flag;
	}

	public int hashCode(){
		return age;
	}
}

