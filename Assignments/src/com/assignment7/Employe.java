package com.assignment7;

public class Employe {
	private int eid;
	private String ename;
	private double salary;

	public Employe(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employe e1 = new Employe(1, "reva", 20000);
		Employe e2 = new Employe(2, "riya", 30000);
		Employe e3 = new Employe(3, "sona", 10000);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
