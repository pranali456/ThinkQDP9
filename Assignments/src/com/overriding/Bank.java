package com.overriding;

import java.util.Scanner;

public class Bank {

    public static double getInterestRate(String accountType) {
        double defaultRate = 2.0;
        double savingsRate = 3.0;
        double currentRate = 5.0;
        double interestRate = 0.0;

        if (accountType.equals("default")) {
            interestRate = defaultRate;
        } else if (accountType.equals("savings")) {
            interestRate = savingsRate;
        } else if (accountType.equals("current")) {
            interestRate = currentRate;
        } else {
            System.out.println("Invalid account type. Using default rate.");
            interestRate = defaultRate;
        }

        return interestRate;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account type (default/savings/current): ");
        String accountType = scanner.nextLine();

        double interestRate = getInterestRate(accountType.toLowerCase());
        System.out.println("Interest Rate for " + accountType + ": " + interestRate + "%");

        scanner.close();
    }
}




