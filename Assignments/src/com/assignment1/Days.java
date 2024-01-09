
// Write a Java program to convert days into years, weeks and days
package com.assignment1;

public class Days {

	public static void main(String[] args) {
		int days,year,weeks;
		days=799;
		year=days/365;
		weeks=(days-(year*365))/7;
		days=days-((year*365)+(weeks*7));
		
		System.out.println("days in year="+ year);
		System.out.println("days in weeks="+ weeks);
		System.out.println("days in days="+ days);

	}

}
