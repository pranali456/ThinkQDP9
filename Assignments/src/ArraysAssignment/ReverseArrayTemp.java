package ArraysAssignment;

import java.util.Arrays;

public class ReverseArrayTemp {

	public static void reverseArray(int arr[]) {
		int revarr[] = new int[arr.length];
		int index = 0;
		for (int i = arr.length; i > 0; i--) {
			if (index < revarr.length) {
				revarr[index] = arr[i];
				index++;
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };

		System.out.println(Arrays.toString(arr));
		reverseArray(arr);

	}

}
