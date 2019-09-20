package com.org.exception;

public class UserDefinedExceptionUnchecked {

	// As AdditionExceptionUnchecked extends RuntimeException,
	// so no need to use try catch block or throws clause.
	public int addition (int i, int j) {
		if(i <= 0 || j<=0){
			throw new AdditionExceptionUnchecked("problem in adding.");
		}
		return (i + j);
	}

	public static void main(String[] args) {
		
		UserDefinedExceptionUnchecked userExc = new UserDefinedExceptionUnchecked();
		try {
			//System.out.println(userExc.addition(10,2));
			System.out.println(userExc.addition(10,0));
		} catch (AdditionExceptionUnchecked e) {
			e.printStackTrace();
		}
		
	}
	
}

class AdditionExceptionUnchecked extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// To print the description of the exception, we should use super keyword.
	public AdditionExceptionUnchecked(String info){
		super(info); 
	}
}