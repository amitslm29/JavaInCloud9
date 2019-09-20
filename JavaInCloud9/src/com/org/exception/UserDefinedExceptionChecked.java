package com.org.exception;

public class UserDefinedExceptionChecked {

	// As AdditionExceptionChecked extends Exception,
	// so we have to use try catch block or throws clause.
	public int addition (int i, int j) throws AdditionExceptionChecked {
		if(i <= 0 || j<=0){
			throw new AdditionExceptionChecked("problem in adding.");
		}
		return (i + j);
	}

	public static void main(String[] args) {

		UserDefinedExceptionChecked userExc = new UserDefinedExceptionChecked();
		try {
			System.out.println(userExc.addition(10,2));
			//System.out.println(userExc.addition(10,0));
		} catch (AdditionExceptionChecked e) {
			e.printStackTrace();
		}
	}
}

class AdditionExceptionChecked extends Exception {

	private static final long serialVersionUID = 1L;

	// To print the description of the exception, we should use super keyword.
	public AdditionExceptionChecked(String info){
		super(info); 
	}
}
