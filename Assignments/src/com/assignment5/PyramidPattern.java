package com.assignment5;

import java.util.Scanner;

public class PyramidPattern {
	public static void pyramid() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int sp=1;sp<=rows-i;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		pyramid();
		

	}

}
