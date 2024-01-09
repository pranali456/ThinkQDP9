package com.assignment3;

import java.util.Scanner;

public class UserCost {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int cost=100;
		double total;
		 System.out.println("Enter the quantity");
		 
		 int qty=sc.nextInt();
		 total=qty*cost;
		 if(total>1000)
		 {
			 total=total-(0.1*total);
			 System.out.println(total);
		 }
			 
			 
			 
			 
		 

	}

}
