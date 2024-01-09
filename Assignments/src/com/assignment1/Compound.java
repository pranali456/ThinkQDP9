// Write a Java program to enter P, T, R and calculate Compound Interest

package com.assignment1;

public class Compound {

	public static void main(String[] args) {
		double p,r,t,n,ci;
		p=10000;
		r=0.08;
		t=1;
		n=12;
		
		ci=p*Math.pow(1+ (r/n),(n*t))-p;
		
		System.out.println("compound intrest is:"+ ci);
		

	}

}
