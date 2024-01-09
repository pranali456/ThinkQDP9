package com.ConsructorChaining;

public class Cycle {
	private int accountNo;
	private int noOfWheels;
	
	

	public Cycle() {
		System.out.println("I am default constructor");
	}
	
	  public Cycle(int accountNo, int noOfWheels) {
		
		this();
		System.out.println("I am another constructor");
	}
	  

   public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public static void main(String[] args) {
		Cycle c1= new Cycle();
		
		System.out.println("default constructor output");
		
		Cycle c2= new Cycle(2, 4);
		 System.out.println("Account Number: " + c1.getAccountNo());
	      System.out.println("Number of Wheels: " + c1.getNoOfWheels());
		
		

	}

}
