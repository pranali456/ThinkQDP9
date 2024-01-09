package com.exception;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
			int arr[]= new int[3];
			System.out.println("enter array element");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("----------------------------");
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("value"+100/arr[i]);
			}
		}
		// other catches unreachable to code
//		catch(Exception e) {
//			System.out.println("other"+e);
//		}
		catch(ArithmeticException e) {
			System.out.println(e+"--> Array element is zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e+"-->array is iterater to grater index");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
