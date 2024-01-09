package com.staticandfinal;

public class Employe {
	 private int employeeId;
	    private String name;
	    private double salary;

	   
	    public Employe(int employeeId, String name, double salary) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.salary = salary;
	    }

	    
	    public void displayEmployeeInfo() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	        System.out.println("-------------------------");
	    }

	    // Static method to calculate total number of employees
	    public static int totalEmp(Employe... employee) {
	        return employee.length;
	    }

	    public static void main(String[] args) {
	      
	        Employe emp1 = new Employe(101, "pranali", 50000);
	        Employe emp2 = new Employe(102, "Jay", 60000);
	        Employe emp3 = new Employe(103, "shree", 55000);
	        Employe emp4 = new Employe(104, "chaitali", 70000);
	        Employe emp5 = new Employe(105, "sonali", 65000);

	        
	        emp1.displayEmployeeInfo();
	        emp2.displayEmployeeInfo();
	        emp3.displayEmployeeInfo();
	        emp4.displayEmployeeInfo();
	        emp5.displayEmployeeInfo();

	      
	        System.out.println("Total number of employees: " + Employe.totalEmp(emp1, emp2, emp3, emp4, emp5));
	    }
	}


