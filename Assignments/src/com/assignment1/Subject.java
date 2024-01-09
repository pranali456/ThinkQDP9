// Write a Java program to enter marks of five subjects and calculate total, average and percentage

package com.assignment1;

public class Subject {

	public static void main(String[] args) {
		float sub1,sub2,sub3,sub4,sub5,total,avg,percentage;
		 sub1=50;
		 sub2=60;
		 sub3=75;
		 sub4=80;
		 sub5=65;
		 
		 total=sub1+sub2+sub3+sub4+sub5;
		 avg= total/5;
		 percentage=(total/500)*100;
		 
		 System.out.println("total of subject="+ total);
		 System.out.println("average of sub="+ avg);
		 System.out.println("percentage of sub="+ percentage);

	}

}
