package com.assignment7;

class Account {
	long accNo;
	String customerName;

	public Account() {
		accNo = 23456;
		customerName = "chaitali kashid";

		System.out.println("I am in default constructor");

	}

	public Account(long accNo, String customerName) {

		this.accNo = accNo;
		this.customerName = customerName;
	}

	public String toString() {
		return "Account [accNo=" + accNo + ", customerName=" + customerName + "]";
	}

}

public class Bank {

	public static void main(String[] args) {
		Account a1 = new Account(1234, "jayesh");
		System.out.println(a1.accNo);
		System.out.println(a1.customerName);

		Account a2 = new Account();
		System.out.println(a2.accNo);
		System.out.println(a2.customerName);

		Account account1 = new Account(675489, "sham");
		Account account2 = new Account(124356, "riya");

		System.out.println("\nAccount 1 - Account No: " + account1.accNo + ", Customer Name: " + account1.customerName);
		System.out.println("Account 2 - Account No: " + account2.accNo + ", Customer Name: " + account2.customerName);
	}

}
