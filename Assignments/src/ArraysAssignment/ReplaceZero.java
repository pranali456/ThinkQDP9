package ArraysAssignment;

import java.util.Arrays;

public class ReplaceZero {
	public static void replaceZero(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				ar[i] = 1;

			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34 };

		System.out.println(Arrays.toString(arr));

		replaceZero(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}


