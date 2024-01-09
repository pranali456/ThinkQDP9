package com.assignment6;


public class ClassAndObject {
	
	private int exampleVariable;
	
	
   public ClassAndObject() {
	   exampleVariable=0;
	}
   
  public ClassAndObject(int value) {
	
	this.exampleVariable = value;
}
  public void displayValue() {
	  System.out.println("exampleVariable :"+ exampleVariable);
  }




	public static void main(String[] args) {
		ClassAndObject exp1= new ClassAndObject();
		exp1.displayValue();
		
		
		ClassAndObject exp2= new ClassAndObject(34);
		exp2.displayValue();
		
		

	}

}
