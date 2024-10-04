package com.bptn.course._06_oop;

//inheritance - use existing classes code and extends on it, to avoid writing code multiple times
class ChequingAccount extends BankAccount{
	
	private double overdraftLimit;

	public ChequingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
		super(accountNumber, initialBalance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount > 0  && amount <= (getBalance() + overdraftLimit)) {
			super.withdraw(amount);
		}
	}
}
