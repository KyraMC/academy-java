package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("987654", 1200.00);
		myAccount.displayAccountInfo();
		
		BankAccount newAccount = new BankAccount("123456", 600.00);
		newAccount.displayAccountInfo();
		
		SavingsAccount mySavings = new SavingsAccount("123", 500.00, 1.00);
		mySavings.displayAccountInfo();
		mySavings.applyInterest();
		mySavings.displayAccountInfo();
		
		ChequingAccount myChequing = new ChequingAccount("1234", 400.00, 200.00);
		myChequing.displayAccountInfo();
		myChequing.withdraw(100.00);
		myChequing.displayAccountInfo();

	}

}
