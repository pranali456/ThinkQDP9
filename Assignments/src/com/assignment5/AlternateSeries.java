package com.assignment5;

public class AlternateSeries {
	public static void alternateSeries() {
		int n=10;
		for(int i=1;i<=n;i++) {
			int term=i*2*(i%2==0? -1:1);
			System.out.println(term);
			
			if(i<n) {
				System.out.println(" ");
			}
		}
	}

	public static void main(String[] args) {
		alternateSeries();
		

	}

}
