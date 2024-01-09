package com.assignment5;

public class Temp {

	public static int calculateHours(int initialTemperature, int temperatureDropPerHour) {
		int hours = 0;
		int currentTemperature = initialTemperature;

		while (currentTemperature >= 60) {
			currentTemperature -= temperatureDropPerHour;
			hours++;
		}

		return hours;
	}

	public static void main(String[] args) {
		int initialTemperature = 100;
		int temperatureDropPerHour = 7;

		int hours = calculateHours(initialTemperature, temperatureDropPerHour);

		System.out.println("Hours until the temperature drops below 60 degrees: " + hours);
	}

}
