package com.assignment7;

class SubCourse {
	private int subCourseId;
	private int subCourseName;

	public SubCourse() {
		System.out.println("default subcourse constructor");
	}

	public SubCourse(int subCourseId, int subCourseName) {

		this.subCourseId = subCourseId;
		this.subCourseName = subCourseName;
	}

}

public class Course {
	private int courseId;
	private String courseName;
	private SubCourse subCourse;

	public Course() {
		System.out.println("Course Constructor Called");
		subCourse = new SubCourse();

	}

	public Course(int courseId, String courseName) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.subCourse = new SubCourse();
		System.out.println("Course Constructor Called");
	}

	public static void main(String[] args) {
		Course c1 = new Course(101, "programming");

	}

}
