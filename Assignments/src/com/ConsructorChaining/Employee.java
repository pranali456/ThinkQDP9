package com.ConsructorChaining;

public class Employee {

	private int emp_id;
	private String name;
	private double sal;

	public Employee() {

	}

	public Employee(int emp_id, String name, double sal) {
		this.emp_id = emp_id;
		this.name = name;
		this.sal = sal;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void display() {
		System.out.println("Employee ID: " + emp_id);
		System.out.println("Name: " + name);
		System.out.println("Salary:" + sal);
		System.out.println();
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setEmp_id(1);
		employee1.setName("sachin kashid");
		employee1.setSal(50000.0);

		Employee employee2 = new Employee(2, "pranali", 60000.0);

		System.out.println("Employee 1 details:");
		employee1.display();

		System.out.println("Employee 2 details:");
		employee2.display();
	}
}
