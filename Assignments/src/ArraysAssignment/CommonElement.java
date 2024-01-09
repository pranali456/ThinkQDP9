package ArraysAssignment;

import java.util.Arrays;

public class CommonElement {

	public static void commonElement(int arr1[], int arr2[]) {

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);

				}

			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 12, 23, 34, 67, 78, 91, 56, 23 };
		System.out.println(Arrays.toString(arr1));

		int arr2[] = { 39, 25, 15, 23, 55, 91, 66, 22, 23 };

		System.out.println(Arrays.toString(arr2));

		commonElement(arr1, arr2);

	}

}
