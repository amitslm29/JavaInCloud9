package com.org.output;

import java.util.HashMap;

public class EmployeeWithoutEqualsAndHashcode {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Amit");
		Employee emp2 = new Employee(2, "Bhupati");
		Employee emp3 = new Employee(3, "Rohit");
		Employee emp4 = new Employee(1, "Amit");
		Employee emp5 = new Employee(2, "Rohit");
		Employee emp6 = new Employee(3, "Haroon");
		
		HashMap<Employee, Integer> map = new HashMap<>();
		
		map.put(emp1, 100);
		map.put(emp2, 200);
		map.put(emp3, 300);
		map.put(emp4, 400);
		map.put(emp5, 500);
		map.put(emp6, 600);
		
		System.out.println(map.get(emp6));
	}
}

class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}