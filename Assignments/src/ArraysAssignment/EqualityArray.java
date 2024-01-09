package ArraysAssignment;

import java.util.Arrays;

public class EqualityArray {
	public static boolean chkEqual(int arr1[], int arr2[]) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr1[] = { 12, 22, 32, 42, 52, 62 };
		int arr2[] = { 52, 22, 62, 12, 42, 22 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		boolean areEqual = chkEqual(arr1, arr2);

		if (areEqual) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}

	}

}


	


