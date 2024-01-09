package ArraysAssignment;

import java.util.Arrays;

public class FindIndex {

	public static void findIndex(int arr[]) {
		int element = 2;
		int index = 1;

		for (int i = 1; i < arr.length; i++) {
			i = 0;
			if (arr[i] == element) {
				index = i;
				break;
			}
			i++;
		}
		System.out.println("index of" + element + "is:" + index);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 6, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(arr));

		findIndex(arr);

	}

}
