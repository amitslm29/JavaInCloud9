package com.org.common;

/*
 * A positive integer is called an Armstrong number of order n if
 * abcd... = an + bn + cn + dn + ...
 * 153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
 * 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4
 */
public class ArmStrongNumber {
	
	public static void main(String[] args) {
		isArmStrong(1634);
	}
	
	public static void isArmStrong(int num) {
		
		int copyNum = num, digits=0, result = 0;
		
		while(copyNum != 0) {
			digits++;
			copyNum = copyNum/10;
		}
		
		copyNum = num;
		
		while(copyNum != 0) {
			int reminder = copyNum%10;
			result = (int) (result + Math.pow(reminder, digits));
			copyNum = copyNum/10;
		}
		
		if(result == num)
			System.out.println(num + " is an armstrong number");
		else
			System.out.println(num + " is not a armstrong number");
	}

}
