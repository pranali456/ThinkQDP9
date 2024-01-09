package ArrayObjectAssignment;

class Student {
	int roll;
	String name;
	int age;
	int marks;

	public Student(int roll, String name, int age, int marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}

public class StudentArray {
	public static void main(String[] args) {
		Student[] students = { new Student(1, "pranali", 14, 75),
				             new Student(2, "chaitali", 16, 80),
				             new Student(3, "siya", 13, 58), 
				             new Student(4, "dhoni", 15, 65), 
				             new Student(5, "reva", 14, 70) };

		System.out.println("Students with marks more than 60 and age less than 15:");
		for (Student student : students) {
			if (student.marks > 60 && student.age < 15) {
				System.out.println(student.roll + ": " + student.name);
			}
		}
	}
}
