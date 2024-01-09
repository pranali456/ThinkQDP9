
// Write a Java program to enter P, T, R and calculate Simple Interest
package com.assignment1;

public class SimpleInterest {

	public static void main(String[] args) {
		float pri,rate,time,si;
		double ci;
		pri=5000; // principle amount
		rate=15; // rate
		time=1; // time
		
		
		si= (pri*rate*time)/100;
		ci=pri*Math.pow(1+ (rate/100),time)-pri;
		System.out.println("simple interest is:"+ si);
		System.out.println("compound intrest is:"+ci);

	}

}
