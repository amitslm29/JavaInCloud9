package com.org.enumm;

public class EnumWithSwitch {
	
	enum Direction {
		NORTH, SOUTH, EAST, WEST;
	}
	
	public static void main(String[] args) {
		Direction d = Direction.WEST;
		switch(d) {
		case NORTH:
			System.out.println("North Direction");
			break;
		case SOUTH:
			System.out.println("South Direction");
			break;
		case EAST:
			System.out.println("East Direction");
			break;
		case WEST:
			System.out.println("West Direction");
			break;
		default:
			System.out.println("No Direction");
		}
	}
	
}
