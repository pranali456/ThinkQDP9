package com.abstractAssignment;

class Locker {
	private double money;
	private String jwellery;
	private String pincode;

	public Locker() {
		super();

	}

	public Locker(double money, String jwellery, String pincode) {
		super();
		this.money = money;
		this.jwellery = jwellery;
		this.pincode = pincode;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getJwellery() {
		return jwellery;
	}

	public void setJwellery(String jwellery) {
		this.jwellery = jwellery;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public void displayDetails() {
		System.out.println("money: " + money + ", jwellery: " + jwellery + "pincode:"+pincode);
	}

}

public class LockerDemo {

	public static void main(String[] args) {
		Locker l = new Locker(12000, "necklace", "410504");
		l.displayDetails();

	}

}
