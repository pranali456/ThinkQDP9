package ArraysAssignment;

import java.util.Arrays;

public class MinChar {
	
		public static char findCharArrays(char[] arr) {
			char minChar = arr[0];

			for (char i = 0; i < arr.length; i++) {
				if (arr[i] < minChar) {
					minChar = arr[i];
				}

			}
			return minChar;
		}
	public static void main(String[] args) {
		char arr[] = { 'A', 'B', 'A', 'C', 'B' };

		System.out.println(Arrays.toString(arr));

		char minChar = findCharArrays(arr);

		System.out.println(("min char:" + minChar));
	}

}
