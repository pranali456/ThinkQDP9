package com.assignment5;

public class CountDigit {
	public static int findDigit(int num) {
		do
		{
			int count=0,sum = 0;
			int rem=sum+(num%10);
			System.out.println(rem);
			num/=10;
			count++;
		}while(num!=0);
		return num;
	}

	public static void main(String[] args) {
		int n=789;
		System.out.println("sum of digit:"+ findDigit(n));

	}

}
