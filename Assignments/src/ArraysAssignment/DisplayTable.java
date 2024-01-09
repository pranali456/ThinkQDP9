package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayTable {

	public static int[] printTable(int arr[], int num) {

		for (int i = 1; i <= 10; i++) {
			arr[i - 1] = (num * (i));
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");

		int num = sc.nextInt();

		int arr[] = new int[10];

		System.out.println(Arrays.toString(printTable(arr, num)));

		sc.close();
	}
}