//Create a class Account containing following methods :insert() to insert account datadisplay() to display account information
//deposit() to deposit amountwithdraw() to withdraw amountcheckbalance() to check balance

package com.assignment6;

import java.util.Scanner;

public class Account {

	int acc_no;
	String name;
	float amount;

	public void insert() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Account Number:");
		acc_no = scanner.nextInt();

		System.out.println("Enter Name:");
		name = scanner.next();

		System.out.println("Enter Initial Amount:");
		amount = scanner.nextFloat();

		System.out.println("Account created successfully!");
	}

	public void display() {
		System.out.println("Account Information:");
		System.out.println("Account Number: " + acc_no);
		System.out.println("Account Holder Name: " + name);
		System.out.println("Balance: $" + amount);
	}

	public void deposit() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Deposit Amount:");
		float depositAmount = scanner.nextFloat();

		amount += depositAmount;
		System.out.println("Amount deposited successfully. Updated balance: $" + amount);
	}

	public void withdraw() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Withdrawal Amount:");
		float withdrawalAmount = scanner.nextFloat();

		if (withdrawalAmount > amount) {
			System.out.println("Insufficient funds. Withdrawal failed.");
		} else {
			amount -= withdrawalAmount;
			System.out.println("Amount withdrawn successfully. Updated balance: $" + amount);
		}
	}

	public void checkBalance() {
		System.out.println("Current Balance: $" + amount);
	}

	public static void main(String[] args) {

		Account account = new Account();

		account.insert();
        account.display();
        account.deposit();
        account.withdraw();
        account.checkBalance();
	}
}
