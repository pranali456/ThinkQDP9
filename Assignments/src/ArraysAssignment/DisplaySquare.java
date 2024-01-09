package ArraysAssignment;

import java.util.Arrays;

public class DisplaySquare {
	
	public static void displaySqua(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			double sqrt= Math.sqrt(arr[i]);
			if(sqrt*sqrt==arr[i]&& arr[i] != 39 && arr[i] != 0) {
				System.out.println(arr[i]+" ");
				
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {23, 43, 25, 49, 12,9, 78, 66, 39, 0};
		System.out.println(Arrays.toString(arr));
		
		displaySqua(arr);
		

	}

}
