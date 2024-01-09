package com.assignment3;

import java.util.Scanner;

public class NumDivision {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		if((num%5==0) && (num%11==0))
		{
			System.out.println(num + ": is divsible by 5 and 11");
		}
			else {
				System.out.println(num + ": is not divsible by 5 and 11");
			}
			
		}
	}




