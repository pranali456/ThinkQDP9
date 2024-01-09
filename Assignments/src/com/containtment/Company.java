package com.containtment;

public class Company {

	public static void main(String[] args) {
		Dept d1 = new Dept(101, "It");
		Dept d2 = new Dept(102, "Bpo");
		Dept d3= new Dept(103, "finance");
		
		Employee e1= new Employee(1, "jayesh", 20000, d3);
		Employee e2= new Employee(2, "pranali", 25000, d1);
		Employee e3= new Employee(3, "kartiki", 30000, d2);
		Employee e4= new Employee(4, "sidhnat", 25000, d3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);

	}

}
