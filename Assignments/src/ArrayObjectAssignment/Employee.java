package ArrayObjectAssignment;

class Employee {
	private int emp_id;
	private String emp_name;
	private double salary;
	private MyDate date;
	private Dept dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_name, double salary, MyDate date, Dept dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.date = date;
		this.dept = dept;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", date=" + date
				+ ", dept=" + dept + "]";
	}

}
