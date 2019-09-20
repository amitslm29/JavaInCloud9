package com.org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEmployeeDemo {

	public static void main(String[] args) {

		List<EmployeeC> empList = new ArrayList<EmployeeC>();
		empList.add(new EmployeeC(55, "Bhupati", 1000));
		empList.add(new EmployeeC(66, "Rohit", 1000));
		empList.add(new EmployeeC(44, "Haroon", 1000));

		System.out.println("====== Before Sorting ======");
		for(EmployeeC emp : empList){
			System.out.println(emp.getEmpId() + " " + 
					emp.getEmpName() + " " + emp.getEmpSalary());
		}

		System.out.println("=== After Sorting ======");
		Collections.sort(empList);
		for(EmployeeC emp : empList){
			System.out.println(emp.getEmpId() + " " + 
					emp.getEmpName() + " " + emp.getEmpSalary());
		}

		System.out.println("=== Sorting in descending order ======");
		Collections.sort(empList, Collections.reverseOrder());
		for(EmployeeC emp : empList){
			System.out.println(emp.getEmpId() + " " + 
					emp.getEmpName() + " " + emp.getEmpSalary());
		}
	}
}

class EmployeeC implements Comparable<EmployeeC>{
	private int empId;
	private String empName;
	private int empSalary;

	public EmployeeC(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	//Sorting based on Employee ID
	@Override
	public int compareTo(EmployeeC nextEmp) {
		int otherEmpId = nextEmp.getEmpId(); 

		//return this.getEmpId() - otherEmpId;

		//OR

		if(this.getEmpId() > otherEmpId){
			return 1;
		}else if(this.getEmpId() < otherEmpId){
			return -1;
		}else{
			return 0;
		}
	}
}
