package com.assignment5;

public class LeftTriangle {

	public static void main(String[] args) {
		int i,j, sp, row = 6;       
		 
		for (i=0; i<row; i++)   
		{  
		    
		for (sp=2*(row-i); sp>=0; sp--)         
		{  
		    
		System.out.print(" ");   
		}   
		
		for (j=0; j<=i; j++ )   
		{   
		    
		System.out.print("* ");   
		}   
		
		System.out.println();   
		}   
		}   
		

	}


