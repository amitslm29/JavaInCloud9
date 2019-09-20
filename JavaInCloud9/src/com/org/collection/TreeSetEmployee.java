package com.org.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEmployee {
	
	public static void main(String[] args) {
		Employeee ec1 = new Employeee(4, "Amit");
		Employeee ec2 = new Employeee(5, "Rohit");
		Employeee ec3 = new Employeee(1, "Ravi");
		Employeee ec4 = new Employeee(3, "Haroon");
		Employeee ec5 = new Employeee(2, "Bhupati");
		
		TreeSet<Employeee> t1 = new TreeSet<>();
		t1.add(ec1);
		t1.add(ec2);
		t1.add(ec3);
		t1.add(ec4);
		t1.add(ec5);
		System.out.println(t1);
		
		TreeSet<Employeee> t2 = new TreeSet<>(new EmployeeComparator());
		t2.add(ec1);
		t2.add(ec2);
		t2.add(ec3);
		t2.add(ec4);
		t2.add(ec5);
		System.out.println(t2);
	}

}


class Employeee implements Comparable<Employeee> {
	
	int id;
	String name;

	Employeee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + "--" + name;
	}
	
	@Override
	public int compareTo(Employeee ec) {
		int id1 = this.id;
		int id2 = ec.id;
		if (id1 < id2)
			return -1;
		else if (id1 > id2)
			return 1;
		else
			return 0;
	}
	
}

class EmployeeComparator implements Comparator<Employeee> {

	@Override
	public int compare(Employeee e1, Employeee e2) {
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
}