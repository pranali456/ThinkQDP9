package com.CustomException;

public class Bank {
	private int accno;
	private String name;
	 double balance;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int accno, String name) {
		super();
		this.accno = accno;
		this.name = name;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + "]";
	}
	void deposite(double amount) {
		double balance = amount;
		System.out.println("amount deposited"+ amount);
		System.out.println("new balance"+ balance);
	}
	void withdraw(double amount) {
		try {
			if((this.balance-amount)<0){
				throw new Exception("your balance is low"+ balance);
				
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	

	public static void main(String[] args) {
		Bank b= new Bank(1234, "reetu");
		b.deposite(2000);
		b.withdraw(1000);
	}

	}


