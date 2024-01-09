package ArraysAssignment;

import java.util.Arrays;

public class ElementSquare {
	public static void negativewithSquare(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0 && i != 0) {
				ar[i] = ar[i - 1] * ar[i - 1];
			}
		}
		for (int i : ar) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };
         
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("after converting negative value with square");

		negativewithSquare(arr);

	}

}
