package com.assignment4;

public class NoOfDays {

	public static void main(String[] args) {
      int mNo=2;
		
		switch(mNo)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("31 days");
		         break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30 days");
		case 2: int year=2020;
		        if((year%4==0)&&(year%100!=0)||(year%400==0))
		        System.out.println("29 days");
		        else
		        	System.out.println("28 days");
		        break;
		       default: System.out.println("Error");
		
		}


	}

}
