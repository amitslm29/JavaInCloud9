package com.org.general;

/*
 * Here we are restricting main class to access the Voter class fields directly
 * by making these fields private.
 * Main class should access the data only through public methods.
 * Even we have put a condition inside setAge method, so that main class should
 * not assign wrong data to the age field.
 */
public class EncapsulationSecond {
	
	public static void main(String[] args) {
		Voter01 voter = new Voter01();
		voter.setName("Amit");
		voter.setAge(8); // Invalid age for Voting
		System.out.println("Name of Voter : " + voter.getName());
		System.out.println("Age of Voter : " + voter.getAge());
	}

}

class Voter01 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 18) {
			throw new RuntimeException("Invalid age for Voting...");
		}
		this.age = age;
	}
	
	
}
