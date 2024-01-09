package ArraysAssignment;

import java.util.Arrays;

public class ShuffleArray {
	public static void shuffleElement(int arr[]) {
		int temp;
		int n = arr.length;
		for (int i = n - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}

	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 23, 67, 39, 10, 2 };
		System.out.println(Arrays.toString(arr));

		shuffleElement(arr);

		System.out.println(Arrays.toString(arr));

	}

}
