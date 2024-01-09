package exceptionoverridng;

class Parent {
	int data = 50;

	// not throwing any exception
	void printData() {
		System.out.println(data);
	}

	void printData2() throws ArithmeticException {
		System.out.println(data / 0);
	}
}

class Child extends Parent {
	int val = 0;

	void printData() throws ArithmeticException {
		if (val == 0)
			throw new ArithmeticException();
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.printData();
		c.printData2();

	}

}
