package com.assignment6;

public class StudentPercentage {
	private String name;
	private int marksObtained;
	private int totalMarks;

	public StudentPercentage(String name, int marksObtained, int totalMarks) {
		this.name = name;
		this.marksObtained = marksObtained;
		this.totalMarks = totalMarks;
	}

	public double calculatePercentage() {
		return ((double) marksObtained / totalMarks) * 100;
	}

	public void printResult() {
		double percentage = calculatePercentage();

		System.out.println("Student Name: " + name);
		System.out.println("Marks Obtained: " + marksObtained);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Percentage: " + percentage + "%");

		if (percentage >= 80) {
			System.out.println("Result: 1st Class");
		} else if (percentage >= 60) {
			System.out.println("Result: 2nd Class");
		} else if (percentage >= 40) {
			System.out.println("Result: Pass");
		} else {
			System.out.println("Result: Fail");
		}
	}

	public static void main(String[] args) {

		StudentPercentage student = new StudentPercentage("John Doe", 75, 100);

		student.printResult();
	}
}
