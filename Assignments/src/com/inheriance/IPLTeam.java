package com.inheriance;

public class IPLTeam {
	void play() {
		System.out.println("IPL Team is playing.");
	}
}

class CSK extends IPLTeam {
	void show() {
		System.out.println("csk win ");
	}

}

class RCB extends IPLTeam {
	void show() {
		System.out.println("RCB win");

	}

	public static void main(String[] args) {

		CSK cskTeam = new CSK();
		RCB rcbTeam = new RCB();

		System.out.println("CSK Team:");
		cskTeam.play();

		System.out.println("\nRCB Team:");
		rcbTeam.play();
	}
}
