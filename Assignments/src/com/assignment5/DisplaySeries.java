package com.assignment5;

public class DisplaySeries {
	public static void displaySeries() {
		
		for(int i=1;i<=10;i++) {
			int term=i*10;
			System.out.println(term);
			
			if(i<term) {
				System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) {
		displaySeries();
		

	}

}
