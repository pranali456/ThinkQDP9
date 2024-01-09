package ArraysAssignment;

import java.util.Arrays;

public class SwapArray {
	
	public static void swapArray(int arr[]) {
		int temp;
		int leng=arr.length;
		if(leng<2) {
			return;
		}
		for(int i=0;i<leng/2;i++) {
			int j= leng-1-i;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
						
		}
	}
	

	public static void main(String[] args) {
		int arr[]= {2,4,9,0};
		System.out.println(Arrays.toString(arr));
		
		swapArray(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
