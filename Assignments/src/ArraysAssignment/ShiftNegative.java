package ArraysAssignment;

import java.util.Arrays;

public class ShiftNegative {

	public static void shiftNegative(int ar[]) {
		int i, j;
		int temp;
		int len = ar.length;

		for (i = 0; i < len; i++) {
			if (ar[i] <= 0) 
				continue;
			else {
				for (j = len - 1; j >= 0 && i < j; j--) {
					if (ar[j] < 0) { 
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
		int arr[] = { 2, -4, 6, -9, 5, 7, -8 };

		System.out.println(Arrays.toString(arr));

		shiftNegative(arr);

		System.out.println(Arrays.toString(arr));

	}

}
