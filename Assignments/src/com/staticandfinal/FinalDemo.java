package com.staticandfinal;


final class FinalClass {
   
}


public class FinalDemo {     // when class is final we cannot extend this class
   
    public final int MAX_VALUE = 100;

    // Final method that cannot be overridden
     final void displayMessage() {             
        System.out.println("This is a final method.");
    }

   
//   class Final extends FinalDemo{
//	   void displayMessage() {
//		   
//	   }
//	   
   
    
    public static void main(String[] args) {
       
        FinalClass finalClassObj = new FinalClass();

//        
//        FinalDemo obj = new FinalDemo(50);
//
//       
//        System.out.println("MAX_VALUE: " + obj.MAX_VALUE);
//
//       
//        obj.displayMessage();
    }
}


	


