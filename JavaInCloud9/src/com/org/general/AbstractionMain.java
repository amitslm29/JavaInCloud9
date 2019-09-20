package com.org.general;

public class AbstractionMain {
	
	public static void main(String[] args) {
		BankInterface iHdfc = new HDFC();
		iHdfc.deposit();
		iHdfc.withdraw();
		iHdfc.interestCalculation();
		
		BankInterface iSbi = new SBI();
		iSbi.deposit();
		iSbi.withdraw();
		iSbi.interestCalculation();
	}

}

interface BankInterface {
	
	void deposit();
	void withdraw();
	void interestCalculation();
}

/* Here deposit() and withdraw() are common methods for all banks.
 * So we have provided the implementation in abstract class itself.
 * Interest calculation is different for each bank, so we have
 * implemented this method in all subclasses.*/
abstract class BankAbstractClass implements BankInterface {
	
	public void deposit(){
		System.out.println("Customer deposit money into the Bank.");
	}
	
	public void withdraw(){
		System.out.println("Customer withdraw money from Bank.");
	}
}

class HDFC extends BankAbstractClass implements BankInterface {

	@Override
	public void interestCalculation() {
		System.out.println("HDFC Bank Interest Calculation");
	}
	
}

class SBI extends BankAbstractClass implements BankInterface {

	@Override
	public void interestCalculation() {
		System.out.println("SBI Bank Interest Calculation");
	}
	
}












