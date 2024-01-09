//Write a Java program to check whether a number is negative, positive or zero

package com.assignment3;

import java.util.Scanner;

public class NumChk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num>0)
			System.out.println(num +" is positive");
		else if(num<0)
			System.out.println(num +": is negative");
		else
			System.out.println(num+": is zero");
			
		}
		
		

	}


