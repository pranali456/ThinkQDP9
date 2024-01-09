package com.assignment3;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of five subject");
		System.out.println("Enter the name");
		
		float sub1=sc.nextFloat();
		float sub2=sc.nextFloat();
		float sub3=sc.nextFloat();
		float sub4=sc.nextFloat();
		float sub5=sc.nextFloat();
		
		float percentage=((sub1+sub2+sub3+sub4+sub5)/500)*100;
		System.out.println("percentage of five subjects" + percentage);
		
		
		
		
		

	}

}
