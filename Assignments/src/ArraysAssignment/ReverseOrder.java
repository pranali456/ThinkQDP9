package ArraysAssignment;

import java.util.Arrays;

public class ReverseOrder {

	public static void reverseOder(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };

		System.out.println(Arrays.toString(arr));
		reverseOder(arr);

	}

}
