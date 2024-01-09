package com.abstractAssignment;

class Wifi {
	protected String sid;
	protected String password;

	public Wifi() {
		super();

	}

	public Wifi(String sid, String password) {
		super();
		this.sid = sid;
		this.password = password;
	}

	protected void connect() {
		System.out.println("Connected to Wi-Fi network: " + sid);
	}

}

class Employee1 extends Wifi {

	public Employee1(String sid, String password) {
		super(sid, password);
	}

	public void attemptConnection() {
		System.out.println("Attempting to connect using employee's device...");
		connect();
	}
}

class AdminDevice extends Wifi {

	public AdminDevice(String sid, String password) {
		super(sid, password);
	}

	public void set() {
		System.out.println("setup the device");
	}

	public class WifiDemo {

		public static void main(String[] args) {

			Wifi w = new Wifi("1254", "sona@123");
			w.connect();

			Employee1 e = new Employee1("mywifi", "pra123");
			e.attemptConnection();

			AdminDevice a = new AdminDevice("mywifi", "pra123");
			a.set();

		}
	}
}
