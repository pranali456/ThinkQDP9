package com.assignment6;

public class StudentHashcode {
	private int studentId;
	private String studentName;

	public StudentHashcode(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public static void main(String[] args) {
      // with new keyword
		Student student1 = new Student(1, "John Doe");
		Student student2 = new Student(2, "Alice Smith");

		System.out.println("Student 1: " + student1 + " and its hash code: " + student1.hashCode());
		System.out.println("Student 2: " + student2 + " and its hash code: " + student2.hashCode());
		
		// without new keyword
		
		 Student s1 = new Student(1, "John Doe");
	        Student s2 = s1;

	       
	        System.out.println("Without new keyword:");
	        System.out.println("s1: " + s1 + " and its hash code: " + s1.hashCode());
	        System.out.println("s2: " + s2 + " and its hash code: " + s2.hashCode());
	}
}
