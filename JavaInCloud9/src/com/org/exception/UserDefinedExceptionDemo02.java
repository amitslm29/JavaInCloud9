package com.org.exception;

public class UserDefinedExceptionDemo02 {
	
	public int division(int i, int j) throws 
		InvalidDividendException, InvalidDivisorException{
		if(i <= 0){
			throw new InvalidDividendException();
		}else if(j==0){
			throw new InvalidDivisorException();
		}
		return i/j;
	}
	
	public static void main(String[] args) {
		UserDefinedExceptionDemo02 userExc = new UserDefinedExceptionDemo02();
		try {
			userExc.division(10, 0);
			//userExc.division(10, 2);
		} catch (InvalidDividendException e) {
			e.printStackTrace();
		} catch (InvalidDivisorException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block is executed.");
		}
		
	}

}

class InvalidDividendException extends Exception{
	
}

class InvalidDivisorException extends Exception{
	
}