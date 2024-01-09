package com.twoDimetionArray;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptData {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a size");
		int size= sc.nextInt();
		
		float arr[] = new float[size];
		System.out.println("Enter a element");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();
			
		}
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

}