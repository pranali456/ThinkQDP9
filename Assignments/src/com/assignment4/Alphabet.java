package com.assignment4;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the alphabet");
		char alphabet= sc.next().charAt(0);
		
		switch(alphabet) {
		case  'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		
			System.out.println(alphabet + "it is vowel");
			 break;
			 
			 default:
				 System.out.println(alphabet + "it is consonant");
		}

	}

}
