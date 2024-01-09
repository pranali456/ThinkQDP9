package com.assignment5;

public class PrimeNumber {
	
	public static boolean cheakPrime(int num) {
		boolean status = true;
		if(num<=1) {
			status=false;
		}else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					status=false;
					break;
				}
			}
		}
		if(status) {
			System.out.println(num +"is a prime number");
		
		}
		return status;
		}

	public static void main(String[] args) {
		for(int num=300;num<=400;num++) {
			cheakPrime(num);
		}
		
		

	}

}
