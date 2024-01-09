//Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius
package com.assignment1;

public class TemFar {

	public static void main(String[] args) {
		float fahrenheit,celsius;
		fahrenheit=43;
		
		celsius=((fahrenheit-32)*5)/9;
		
		System.out.println("tempreture in celsius=" + celsius);
		

	}

}
