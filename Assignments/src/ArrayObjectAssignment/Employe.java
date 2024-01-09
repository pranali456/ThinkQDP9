package ArrayObjectAssignment;

class Employe {
	private int empNo;
	private String name;
	private Department dept;

	public Employe(int empNo, String name, Department dept) {
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Employe{empNo=" + empNo + ", name='" + name + "', dept=" + dept.getDeptName() + '}';
	}
}
