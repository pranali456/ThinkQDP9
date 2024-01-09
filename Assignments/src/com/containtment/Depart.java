package com.containtment;

public class Depart {
	
	private int did;
	private String dname;
	
	public Depart() {
		
	}

	public Depart(int did, String dname) {
		
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	
	public String toString() {
		return "Depart [did=" + did + ", dname=" + dname + "]";
	}
	
	
	
	
	

}
