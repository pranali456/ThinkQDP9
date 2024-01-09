package ArraysAssignment;

import java.util.Arrays;

public class FindMinNumber {
	
	public static int findSecondMin(int arr[]) {
		int min=arr[0];
		int secondMin=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin=min;
				min=arr[i];
				
			}
			else if(arr[i]<secondMin && arr[i]>min)
			{
				secondMin=arr[i];
			}
		}
		return secondMin;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {-20, 0, -25, 15, 19, 37, 23};
		
		System.out.println(Arrays.toString(arr));
		   System.out.println(findSecondMin(arr));
		
		}

	}


