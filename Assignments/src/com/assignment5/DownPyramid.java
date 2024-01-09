package com.assignment5;

public class DownPyramid {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--) {
			for(int sp=4;sp>=i;sp--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

	}


