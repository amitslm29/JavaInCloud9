package com.org.exception;

/*
 * In additionChecked(), we have used throws clause, as UserDefinedCheckedException is
 * a checked exception. Method needs to handle checked exception, otherwise compiler
 * will throw error.
 * 
 * In additionUnchecked(), we have not used throws clause, as UserDefinedUncheckedException
 * is an unchecked exception. Method no need to handle unchecked exception
 */
public class UserDefinedExceptionDemo01 {
	
	public int additionChecked (int i, int j) throws UserDefinedCheckedException {
		if(i <= 0 || j<=0){
			throw new UserDefinedCheckedException();
		}
		return (i+j);
	}
	
	public int additionUnchecked (int i, int j) {
		if(i <= 0 || j<=0){
			throw new UserDefinedUncheckedException();
		}
		return (i+j);
	}
	
	public static void main(String[] args) {
		
	}
}

class UserDefinedCheckedException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
}

class UserDefinedUncheckedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
}