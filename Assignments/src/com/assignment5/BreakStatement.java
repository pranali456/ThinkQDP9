package com.assignment5;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
				if(i==5) {
					System.out.println("break the loop");
					break;
				}
			}
		}

	}

}
