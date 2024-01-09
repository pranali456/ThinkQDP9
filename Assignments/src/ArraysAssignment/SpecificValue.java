package ArraysAssignment;

import java.util.Arrays;

public class SpecificValue {

	public static boolean specificValue(int arr[], int n) {
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 3, 7, 8 };
		int n = 5;

		System.out.println(Arrays.toString(arr));

		specificValue(arr, n);
		
		System.out.println(Arrays.toString(arr));

	}

}
