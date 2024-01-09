package com.assignment5;

public class DisplaySeriesNumber {
	public static void displaySeries() {
		int term=1;
		int n=10;
		for(int i=1;i<=n;i++) {
			System.out.println(term);
			
			if(i<n) {
				System.out.println(" ");
			}
			term=term+i;
		}
	}

	public static void main(String[] args) {
		displaySeries();
		

	}

}
