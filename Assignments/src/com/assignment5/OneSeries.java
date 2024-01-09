package com.assignment5;

public class OneSeries {
	
	public static void series() {
		int n=5;
		int term=0;
		for(int i=1;i<=n;i++) {
			term=term*10+1;
			System.out.println(term);
			
			if(i<n) {
				System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) {
		series();
		

	}

}
