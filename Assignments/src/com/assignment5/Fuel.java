package com.assignment5;

public class Fuel {
	 public static int calculatePrice(int barrels, int pricePerBarrel) {
	        if (barrels <= 10) {
	            return barrels * pricePerBarrel;
	        } else {
	            int discount = barrels;
	            return barrels * (pricePerBarrel - discount);
	        }
	 }

	public static void main(String[] args) {
		  int totalBarrels = 20;
	        int pricePerBarrel = 89;

	        for (int barrels = 1; barrels <= totalBarrels; barrels++) {
	            int price = calculatePrice(barrels, pricePerBarrel);
	            System.out.println("Price for " + barrels + " barrels: Rs. " + price);
	        }
	    
	}
		

	}


