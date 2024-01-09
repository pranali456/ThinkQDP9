package ArrayObjectAssignment;

public class EmpDept {

	public static void main(String[] args) {
		Department hrDept = new Department(101, "HR");
		Department itDept = new Department(102, "IT");
		Department financeDept = new Department(103, "Finance");

		Employe[] employees = { new Employe(1, "John", hrDept), new Employe(2, "Jane", itDept),
				new Employe(3, "Doe", financeDept) };

		System.out.println("Array of employees with different departments:");
		for (Employe employee : employees) {
			System.out.println(employee);
		}
	}
}
