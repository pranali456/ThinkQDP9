package com.abstractAssignment;

public class Employee {
	
	private String name;
    private int id;
    private int hoursWorked;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.hoursWorked = 0;
    }

    public void work(int hours) {
        this.hoursWorked += hours;
    }

    public int calculateSalary() {
        
        int hourlyRate = (this instanceof PartTimeEmployee) ? 200 : 500;
        return hoursWorked * hourlyRate;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Hours Worked: " + hoursWorked + ", Salary: " + calculateSalary() + " rs.");
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int id) {
        super(name, id);
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int id) {
        super(name, id);
    }



    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("John Doe", 1);
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Jane Doe", 2);

       
        partTimeEmployee1.work(10);
        fullTimeEmployee1.work(20);

       
        System.out.println("Details of Part-Time Employee:");
        partTimeEmployee1.displayDetails();

        System.out.println("\nDetails of Full-Time Employee:");
        fullTimeEmployee1.displayDetails();
    }
}
    

