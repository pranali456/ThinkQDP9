package com.assignment5;

public class SquareSeries {
	
	public static void squareSeries() {
		for(int i=1;i<=10;i++) {
			int term=i*i;
			System.out.println(term);
			
			if(i<term) {
				System.out.println(" ");
			}
			
		}
	}
	

	public static void main(String[] args) {
		squareSeries();
		

	}

}
