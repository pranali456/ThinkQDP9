package ArraysAssignment;

import java.util.Arrays;

public class MaxChar {
	
	public static char findMax(char arr[] ) {
		char maxChar = arr[0];

		for (char i = 0; i < arr.length; i++) {
			if (arr[i] > maxChar) {
				maxChar = arr[i];
			}

		}
		return maxChar;
	}
		
		
	

	public static void main(String[] args) {
		char arr[]= {'A', 'D', 'E', 'x','R', 'Z', 'p'};
		
		System.out.println(Arrays.toString(arr));

		char maxChar = findMax(arr);

		System.out.println(("min char:" + maxChar));
	}

		

	}


