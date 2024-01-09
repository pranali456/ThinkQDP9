package com.assignment5;

public class CalItem {
	public static int calculateTotalCost(int totalItems) {
		int totalCost = 0;

		for (int itemNumber = 1; itemNumber <= totalItems; itemNumber++) {
			totalCost += itemNumber; 
		}

		return totalCost;
	}

	public static void main(String[] args) {
		int totalItems = 100;
		int totalCost = calculateTotalCost(totalItems);

		System.out.println("Total cost of the items: Rs. " + totalCost);
	}

}
