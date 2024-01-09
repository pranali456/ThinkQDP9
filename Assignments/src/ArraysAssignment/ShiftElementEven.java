package ArraysAssignment;

import java.util.Arrays;

public class ShiftElementEven {

	public static void shiftEvenEnd(int ar[]) {
		int i, j;
		int temp;
		int len = ar.length;

		for (i = 0; i < len; i++) {
			if (ar[i] % 2 == 0)
				continue;
			else {
				for (j = len - 1; j >= 0 && i < j; j--) {
					if (ar[j] % 2 == 0) {
						temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 6, 7, 8, 5, 9 };

		System.out.println(Arrays.toString(arr));

		shiftEvenEnd(arr);

		System.out.println(Arrays.toString(arr));

	}

}
