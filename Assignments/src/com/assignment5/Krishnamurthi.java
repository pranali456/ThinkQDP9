package com.assignment5;

import java.util.Scanner;

public class Krishnamurthi {
	public static long calculateFactorial(int n) {
		long fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
	
	public static void checkNumber(int no) {

	
		int orignal=no;
		
		long sum=0;
		
		do{
			int rem= no%10;
			sum=sum+calculateFactorial(rem);
			no/=10;
		}
			
			while(no!=0);
			if(orignal==sum)
				System.out.println(orignal + "is a krishmurtynumber");
			else 
				System.out.println(orignal + " is not krishnmurthynumber");
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		checkNumber(no);
		
		

	}

}
