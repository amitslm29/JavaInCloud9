package com.org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEmployeeDemo {

	public static void main(String[] args) {

		List<EmployeeComparatorR> arrList = new ArrayList<EmployeeComparatorR>();
		arrList.add(new EmployeeComparatorR(55, "Neha", 1000));
		arrList.add(new EmployeeComparatorR(44, "Dipika", 2000));
		arrList.add(new EmployeeComparatorR(88, "Pallavi", 500));
		arrList.add(new EmployeeComparatorR(66, "Akky", 4000));

		System.out.println("====== Before Sorting ======");
		for(EmployeeComparatorR emp : arrList){
			System.out.println(emp.getEmpId() + " " + emp.getEmpName() + 
					" " + emp.getEmpSalary());
		}

		System.out.println("====== Sorting by Employee ID ======");
		Collections.sort(arrList, new EmployeeSortById());
		for(EmployeeComparatorR emp : arrList){
			System.out.println(emp.getEmpId() + " " + emp.getEmpName() + 
					" " + emp.getEmpSalary());
		}

		System.out.println("====== Sorting by Employee ID in descending order======");
		Collections.sort(arrList,Collections.reverseOrder(new EmployeeSortById()));
		for(EmployeeComparatorR emp : arrList){
			System.out.println(emp.getEmpId() + " " + emp.getEmpName() + 
					" " + emp.getEmpSalary());
		}

		/*System.out.println("====== Sorting by Employee Name ======");
		Collections.sort(arrList, new EmployeeSortByName());
		for(EmployeeComparator emp : arrList){
			System.out.println(emp.getEmpId() + " " + emp.getEmpName() + 
					" " + emp.getEmpSalary());
		}

		System.out.println("====== Sorting by Employee Salary ======");
		Collections.sort(arrList, new EmployeeSortBySalary());
		for(EmployeeComparator emp : arrList){
			System.out.println(emp.getEmpId() + " " + emp.getEmpName() + 
					" " + emp.getEmpSalary());
		}*/

	}
}

class EmployeeComparatorR {
	private int empId;
	private String empName;
	private int empSalary;

	public EmployeeComparatorR (int empId, String empName, int empSalary) {
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
}

class EmployeeSortById implements Comparator<EmployeeComparatorR>{

	@Override
	public int compare(EmployeeComparatorR emp1, EmployeeComparatorR emp2) {
		return emp1.getEmpId() - emp2.getEmpId();
	}

}

class EmployeeSortByName implements Comparator<EmployeeComparatorR>{

	@Override
	public int compare(EmployeeComparatorR emp1, EmployeeComparatorR emp2) {
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

}

class EmployeeSortBySalary implements Comparator<EmployeeComparatorR>{

	@Override
	public int compare(EmployeeComparatorR emp1, EmployeeComparatorR emp2) {
		return emp1.getEmpSalary() - emp2.getEmpSalary();
	}

}
