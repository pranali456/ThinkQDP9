package ArrayObjectAssignment;

class Employee1 {
	int empNo;
	String name;

	public Employee1(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
	}
}

public class EmployeeObjectLoop {

	public static void main(String[] args) {
		Employee1[] employees = new Employee1[5];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee1(i + 1, "Employee" + (i + 1));
		}

		System.out.println("Array of Employee objects created using a for loop:");
		for (Employee1 employee : employees) {
			System.out.println("Employee No: " + employee.empNo + ", Name: " + employee.name);
		}
	}
}
