package exceptionoverridng;

import java.io.IOException;


	class Parent1{
	int data = 50;

	// not throwing chk exception
	void printData() throws IOException{
		System.out.println(data);
		throw new IOException("Input error....");
	}

	void printData2() throws Exception {
		System.out.println(data );
		throw new Exception("Input error....");
	}
}

class Child1 extends Parent1{
	int val = 0;

	void printData() throws ArithmeticException {
		if (val == 0)
			throw new ArithmeticException();
		System.out.println(data/val);
	}
	public class Demo2 {

	public static void main(String[] args) {
		Child1 c= new Child1();
		c.printData();
		
		

	}

	}
}
