// Write a Java program to enter length in centimeter and convert it into meter and kilometer
package com.assignment1;

public class LengthCm {

	public static void main(String[] args) {
		float cm,meter,kilometer;
		
		cm=1000;
		
		meter=cm/100;
		kilometer=cm/100000;
		
		System.out.println("length in meter="+ meter);
		System.out.println("length in kilometer="+kilometer);
		
	}

}
