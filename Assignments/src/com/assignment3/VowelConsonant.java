//Write a Java program to input any alphabet and check whether it is vowel or consonant

package com.assignment3;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the characters");
		
		char ch= sc.next().charAt(0);
		
		if(ch== 'a' || ch=='A'|| ch=='e' || ch=='E' || ch=='i'|| ch=='I' || ch=='o'||ch=='O'|| ch=='u'|| ch=='U')
			System.out.println("It is vowel");
		else
			System.out.println("It is consonant");
			
		

	}

}
