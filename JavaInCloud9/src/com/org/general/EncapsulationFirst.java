package com.org.general;

/*
 * In the below example, we are setting -20 to the age of a voter,
 * which is not at all valid. But we don't have any control here
 * to restrict the age based on our requirement.
 */
public class EncapsulationFirst {
	
	public static void main(String[] args) {
		Voter voter = new Voter();
		String name = voter.name="Amit";
		int age = voter.age=-20;
		System.out.println("Name of Voter : " + name);
		System.out.println("Age of Voter : " + age);
	}

}

class Voter {
	String name;
	int age;
}
