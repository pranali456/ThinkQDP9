package com.staticandfinal;

public class CustomerAccount {

	private double balance;

	public CustomerAccount(double initialBalance) {
		balance = initialBalance;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful" + balance);
		} else {
			System.out.println(" insufficient balance");
		}
	}

	public void makeDebitCardPayment(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Debit card payment successful" + balance);
		} else {
			System.out.println(" insufficient balance.");
		}
	}

	public void useNetBanking(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Net banking transaction successful" + balance);
		} else {
			System.out.println("insufficient balance.");
		}
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {

		CustomerAccount customerAccount = new CustomerAccount(1000);

		customerAccount.withdraw(200);
		customerAccount.makeDebitCardPayment(150);
		customerAccount.useNetBanking(100);

		System.out.println("Final balance: " + customerAccount.getBalance());
	}
}
