package com.org.reflection;

public class Employee {
	
	private int empid;
	private String empName;
	public String companyName;
	
	public Employee(int empid, String empName) {
		this.empid = empid;
		this.empName = empName;;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	private void display() {
		System.out.println("Employee ID : " + getEmpid());
		System.out.println("Employee Name : " + getEmpName());
	}

}
