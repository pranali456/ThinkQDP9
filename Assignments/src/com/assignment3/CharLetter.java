
// Write a Java program to input any character and check whether it is alphabet, digit or special character
package com.assignment3;

import java.util.Scanner;

public class CharLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the char");
		 
		 char ch=sc.next().charAt(0);
		 
		 if((ch>='a'&& ch<='z')|| (ch>='A'&& ch<= 'Z')) {
			 System.out.println(ch +": is alphabet");
		 }else if(ch>='0' && ch<='9') {
			 System.out.println(ch+":is digit");
		 }
		 else {
			 System.out.println(ch+ ":is special character");
		 }
			

	}

}
