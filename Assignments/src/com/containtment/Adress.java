package com.containtment;

public class Adress {
	private String city;
	private String state;
	private String country;
	public Adress() {
		
	}
	public Adress(String city, String state, String country) {
		
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return "Adress [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
	

}
