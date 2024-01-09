package com.assignment5;

public class Product {
	public static long SumProduct()
	{
		long prod=1;
		for(int i=1;i<=20;i++) {
			if(i%2==0)
			
			prod=prod*i;
			}
			return prod;
			
		
	}

	public static void main(String[] args) {
		System.out.println("sum of multiply number is:" +SumProduct());
		
		

	}

}
