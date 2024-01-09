package ArrayObjectAssignment;

public class Dept {
	private int did;
	private String dname;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}

}
