package com.ConsructorChaining;

public class Account {
	
    public long accountNo;
    public String customerName;

    
    public Account() {
       
        this.accountNo = 0;
        this.customerName = "Default Customer";
        System.out.println("I am in default constructor");
    }

   
    public Account(long accountNo, String customerName) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        System.out.println("I am in parameterized constructor");
    }

    public static void main(String[] args) {
      
        Account account1 = new Account();
        System.out.println("Account 1 - Account No: " + account1.accountNo + ", Customer Name: " + account1.customerName);

       
        Account account2 = new Account();
        System.out.println("Account 2 - Account No: " + account2.accountNo + ", Customer Name: " + account2.customerName);

        
        Account account3 = new Account(123456, "John Doe");
        System.out.println("Account 3 - Account No: " + account3.accountNo + ", Customer Name: " + account3.customerName);

        
        Account account4 = new Account(987654, "Jane Doe");
        Account account5 = new Account(111111, "Alice Wonderland");

       
        System.out.println("Account 4 - Account No: " + account4.accountNo + ", Customer Name: " + account4.customerName);
        System.out.println("Account 5 - Account No: " + account5.accountNo + ", Customer Name: " + account5.customerName);

        
        
    }
}