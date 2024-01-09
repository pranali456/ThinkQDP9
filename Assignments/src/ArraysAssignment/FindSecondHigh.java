package ArraysAssignment;

import java.util.Arrays;

public class FindSecondHigh {

	public static void findSecondHigh(int arr[]) {
		int max = arr[0];
		int secondMax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max=arr[i];
				}
			else if(secondMax<arr[i]&& arr[i]!=max)
			{
				secondMax=arr[i];
			}

		}
		System.out.println("max number:"+ max);
		System.out.println("Second max:"+ secondMax);
	}

	public static void main(String[] args) {

		int arr[] = { 20, 0, 31, 45, 100, 1, 105, 90 };
		System.out.println(Arrays.toString(arr));
		findSecondHigh(arr);
	}

}
