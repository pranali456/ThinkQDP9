package com.assignment5;

import java.util.Scanner;

public class QtyMilk {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double total = 0;

	        while (total <= 500) {
	            System.out.print("Enter the quantity of milk (in liters): ");
	            double milkQuantity = scanner.nextDouble();

	            System.out.print("Enter the quantity of oil (in liters): ");
	            double oilQuantity = scanner.nextDouble();

	            double milkCost = milkQuantity * 40;
	            double oilCost = oilQuantity * 50;

	            total += milkCost + oilCost;

	            System.out.println("Total Cost: " + total);
	        }

	        System.out.println("Total quantity of milk and oil entered:");
	        System.out.println("Quantity of milk: " + ((total - 500) / 40) + " liters");
	        System.out.println("Quantity of oil: " + ((total - 500) / 50) + " liters");
	    }
	}


