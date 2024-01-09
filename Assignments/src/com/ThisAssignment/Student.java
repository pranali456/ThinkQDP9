package com.ThisAssignment;

public class Student {
	private int stuId;
	private String name;
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		//stuId = stuId;  assignment to variable stuId has no effect
		this.stuId=stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();
        Student student2 = new Student();
        
      //  this.setStuId(9); non static method cannot reference from static 
        student1.setStuId(11);
        student2.setStuId(21);
       // in main method their is not instance of the class. cannot use this directly inside main
        
        System.out.println("Student 1 - : " + student1.getStuId());
        System.out.println("Student 2 - : " + student2.getStuId());
	}
	
	

}
