package ArraysAssignment;

import java.util.Arrays;

public class AverageValue {
	
	public static void calculateAverage(int arr[]) {
		 
		int sum=0;
		int length=arr.length;
		for(int i=0;i<length;i++) {
			sum +=arr[i];
			}
		double avg= sum/length;
		System.out.println( "average=" +  avg);
	}

	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		
		calculateAverage(arr);
		
		
		

	}

}
