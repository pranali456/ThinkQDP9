package ArraysAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElement {
	public static void missingNumber(int arr[]) {
		boolean status = false;
		for (int i = 1; i <= 7; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					status = true;
					break;
				} 
				else 
				{
					status = false;
				}
			}
			if (status == false) {
				System.out.println("missing element :"+i);
		}
	}

}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7 };
		System.out.println(Arrays.toString(arr));
		missingNumber(arr);
	}
}
