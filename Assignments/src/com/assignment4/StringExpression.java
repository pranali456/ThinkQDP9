package com.assignment4;

import java.util.Scanner;

public class StringExpression {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the game");
		String game=sc.next();
		
		switch(game) {
		case "Hockey":
			System.out.println("play hockey");
			break;
		case "cricket":
			System.out.println("play cricket");
			break;
		case "football":
		System.out.println("play football");
		}
		

	}

}
