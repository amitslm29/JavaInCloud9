package com.org.common;

public class PrimeNumber {

	public static void main(String[] args) {

		//Check whether a number is prime or not
		int number = 11;
		System.out.println("Given number is Prime: " + isPrime(number));
		 
		/*//print all the prime number between 1 and 100
		int limit=100;
		for(int i=1;i<=limit;i++){
			if(isPrime(i)){
				System.out.print(i + ".");
			}
		}

		//sum of prime numbers between 1 and 100
		int limit=100;
		int sum=0;
		for(int i=1;i<=limit;i++){
			if(isPrime(i)){
				sum = sum + i;
			}
		}
		System.out.println("sum of prime numbers between 1 and 100: " + sum);


		//sum of first 1000 prime numbers
		int number = 1;
		int count = 0;
		int sum = 0;
		while(count < 1000){
			if(isPrime(number)){
				sum = sum + number;
				count++;
			}
			number++;
		}
		System.out.println("Sum of first 1000 prime numbers: " + sum);*/
	}

	public static boolean isPrime(int number){
		if(number == 1){
			return false;
		}else{
			for(int i=2;i<number;i++){
				if(number%i == 0){
					return false;
				}
			}
		}
		return true;
	}

}
