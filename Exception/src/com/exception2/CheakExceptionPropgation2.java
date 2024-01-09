package com.exception2;

import java.io.IOException;

public class CheakExceptionPropgation2 {

	void method1() throws IOException {
		throw new IOException("input error");
	}

	void method2() {
		try {
			method1();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CheckedExceptionPropogation obj = new CheckedExceptionPropogation();

		obj.method3();

	}

}
