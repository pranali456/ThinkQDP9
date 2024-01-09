package ArraysAssignment;

import java.util.Arrays;

public class chkIntegerElement {

	public static boolean chkElement(int ar[], int n, int m) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n && ar[i] == m) 
				return true;
			}

		
		return false;

	}

	public static void main(String[] args) {
		int arr[] = { 23, 56, 65, 45, 77 };
		int n = 65;
		int m = 77;
		System.out.println(Arrays.toString(arr));

		System.out.println(chkElement(arr, n, m));

	}

}
