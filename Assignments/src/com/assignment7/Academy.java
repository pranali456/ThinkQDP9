package com.assignment7;

public class Academy {
	private int acaCode;
	private String acaName;
	private String acaLocation;

	public Academy(int acaCode, String acaName, String acaLocation) {

		this.acaCode = acaCode;
		this.acaName = acaName;
		this.acaLocation = acaLocation;
	}

	public int getAcaCode() {
		return acaCode;
	}

	public void setAcaCode(int acaCode) {
		this.acaCode = acaCode;
	}

	public String getAcaName() {
		return acaName;
	}

	public void setAcaName(String acaName) {
		this.acaName = acaName;
	}

	public String getAcaLocation() {
		return acaLocation;
	}

	public void setAcaLocation(String acaLocation) {
		this.acaLocation = acaLocation;
	}

	public String toString() {
		return "Academy [acaCode=" + acaCode + ", acaName=" + acaName + ", acaLocation=" + acaLocation + "]";
	}

	public static void main(String[] args) {
		Academy a1 = new Academy(123, "foundation", "pune");
		Academy a2 = new Academy(234, "Enterprice", "mumbai");
		Academy a3 = new Academy(456, "mastery", "nashik");

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
