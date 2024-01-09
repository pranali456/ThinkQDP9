package ArrayObjectAssignment;

public class EmployeArrayExample {
	 public static void EmployeesWithSameSalary(Employee[] employees) {
	        for (int i = 0; i < employees.length - 1; i++) {
	            for (int j = i + 1; j < employees.length; j++) {
	                if (employees[i].getSalary() == employees[j].getSalary()) {
	                    System.out.println("Employees with the same salary: ");
	                    System.out.println(employees[i]);
	                    System.out.println(employees[j]);
	                    System.out.println("--------------");
	                }
	            }
	        }
	    }

	    public static void EmployeesWithSameDeptName(Employee[] employees) {
	        for (int i = 0; i < employees.length - 1; i++) {
	            for (int j = i + 1; j < employees.length; j++) {
	                if (employees[i].getDept().getDname().equals(employees[j].getDept().getDname())) {
	                    System.out.println("Employees with the same department name: ");
	                    System.out.println(employees[i]);
	                    System.out.println(employees[j]);
	                    System.out.println("--------------");
	                }
	            }
	        }
	    }

	public static void main(String[] args) {
		 Employee[] employees = {
	                new Employee(1, "pranali", 50000, new MyDate(1, 1, 2023), new Dept(101, "HR")),
	                new Employee(2, "Jayesh", 60000, new MyDate(1, 1, 2023), new Dept(102, "IT")),
	                new Employee(3, "kartiki", 50000, new MyDate(2, 2, 2023), new Dept(101, "HR")),
	                new Employee(4, "siddhant", 70000, new MyDate(3, 3, 2023), new Dept(103, "Finance")),
	                new Employee(5, "siya", 60000, new MyDate(2, 2, 2023), new Dept(102, "IT"))
	        };

	        
	        EmployeesWithSameSalary(employees);

	        
	        EmployeesWithSameDeptName(employees);
	    }

	   
	

}


