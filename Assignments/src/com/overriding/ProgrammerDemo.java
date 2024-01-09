package com.overriding;


class Programmer{
	
	void workingHours() {
		System.out.println("programmer working 10 hour per day");
		
	}
}

class Employee extends Programmer{
	
	 void workingHours() {
		 System.out.println("Employe working 8 hour per day");
	 }
}


public class ProgrammerDemo {

	public static void main(String[] args) {
	 Programmer p= new Programmer();
	 p.workingHours();
	 
	 Employee e= new Employee();
	 e.workingHours();

	}

}
