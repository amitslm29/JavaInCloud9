package com.org.collection;

public class EqualsHashcodeOverride {
	
	public static void main(String[] args) {
		EmployeeEH emp1 = new EmployeeEH(1, "Amit", "Agrawal");
		EmployeeEH emp2 = new EmployeeEH(1, "Amit", "Agrawal");

		System.out.println(emp1 == emp2); // false
		System.out.println(emp1.equals(emp2)); // true
		System.out.println(emp1.hashCode()); // 1
		System.out.println(emp2.hashCode()); // 1
	}
}

class EmployeeEH {
	
	int empId;
	String empFirstName;
	String empLastName;
	
	EmployeeEH (int empId, String empFirstName, String empLastName) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	
	@Override
	public boolean equals (Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		/* If two Employee objects are equal based on empId */
		EmployeeEH emp = (EmployeeEH) obj;
		if (this.empId != emp.empId)
			return false;
		return true;
		
		/* If two Employee objects are equal based on all fields */
		/*Employee emp = (Employee) obj;
		if (this.empId != emp.empId)
			return false;
		if(!this.empFirstName.equals(emp.empFirstName))
			return false;
		if(!this.empLastName.equals(emp.empLastName))
			return false;
		return true;*/
	}
	
	@Override
	public int hashCode() {
		
		/* Based on empId */
		//return (int) this.empId;
		return empFirstName.hashCode();
		
		/* Based on all fields */
		//return (int) this.empId * empFirstName.hashCode() * empLastName.hashCode();
	}
	
}
