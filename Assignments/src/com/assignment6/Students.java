
// Create class student and write a meaningful program with 3 methods (1 with return type (calculating percentage), 1 without return
package com.assignment6;

import java.util.Scanner;

public class Students {
	String name;
	int rollNumber;
	int subject1, subject2, subject3, subject4, subject5;

	public double calculatePercentage() {
		int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

		double percentage = (double) totalMarks / 5;
		return percentage;
	}

	public void displayInfo() {
		System.out.println("Student Information:");
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Marks in Subjects:");
		System.out.println("Subject 1: " + subject1);
		System.out.println("Subject 2: " + subject2);
		System.out.println("Subject 3: " + subject3);
		System.out.println("Subject 4: " + subject4);
		System.out.println("Subject 5: " + subject5);
	}

	public void setStudentDetails(String studentName, int studentRoll, int sub1, int sub2, int sub3, int sub4,
			int sub5) {
		name = studentName;
		rollNumber = studentRoll;
		subject1 = sub1;
		subject2 = sub2;
		subject3 = sub3;
		subject4 = sub4;
		subject5 = sub5;
		System.out.println("Student details set successfully!");
	}

	public static void main(String[] args) {

		Students student = new Students();

		student.setStudentDetails("rohit", 101, 85, 90, 78, 92, 88);

		student.displayInfo();

		double percentage = student.calculatePercentage();
		System.out.println("Percentage: " + percentage + "%");
	}
}
