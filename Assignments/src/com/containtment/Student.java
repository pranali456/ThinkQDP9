package com.containtment;

public class Student {

	private int rollNo;
	private String name;

	private Depart dept;

	public Student() {

	}

	public Student(int rollNo, String name, Depart dept) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Depart getDept() {
		return dept;
	}

	public void setDept(Depart dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + "]";
	}

}
