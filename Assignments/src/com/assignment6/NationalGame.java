package com.assignment6;

import java.util.Scanner;

public class NationalGame {
	private String country;
	private String nationalGame;

	public NationalGame(String country) {
		this.country = country.toLowerCase();
		findNationalGame();
	}

	private void findNationalGame() {
		switch (country) {
		case "india":
			nationalGame = "Hockey";
			break;
		case "china":
			nationalGame = "Table Tennis";
			break;
		case "bangladesh":
			nationalGame = "Kabaddi";
			break;
		case "italy":
			nationalGame = "Football";
			break;
		case "united states":
			nationalGame = "Baseball";
			break;
		default:
			nationalGame = "Information not available";
		}
	}

	public void displayResult() {
		System.out.println("National Game of " + country + " is " + nationalGame + ".");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a country name: ");
		String userInputCountry = scanner.nextLine();

		NationalGame nationalGameFinder = new NationalGame(userInputCountry);

		nationalGameFinder.displayResult();

		scanner.close();
	}
}
