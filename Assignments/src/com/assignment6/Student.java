package com.assignment6;

public class Student {

	private int stuId;
	private String stuName;

	public Student(int stuId, String stuName) {

		this.stuId = stuId;
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static void main(String[] args) {
		Student s1= new Student(1, "siya");
		Student s2= new Student(2, "priya");
		System.out.println(s1.getStuId());
		System.out.println(s1.getStuName());

	}

}
