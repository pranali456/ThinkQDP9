package com.staticandfinal;

class FinalDemo9{
   
    final int x;

   
    public FinalDemo9(int x) {
        this.x = x;
    }

   
    final void method2() {
        System.out.println("FinalDemo method2");
    }
}


class FinalDemoChild extends FinalDemo {
    
    public FinalDemoChild(int x) {
        super();
    }

    //  override the final method will give compilation error
   
    // @Override
    // void method2() {
    //     System.out.println("FinalDemoChild method2");
    // }
}

// Try to extend a final class (will result in a compilation error)

// class FinalDemoGrandChild extends FinalDemoChild {}

public class Finalex {
    public static void main(String[] args) {
       
        FinalDemo9 finalDemoObject = new FinalDemo9(10);

        // change the value of the final variable x will give compilation error
       
        // finalDemoObject.x = 20;

       
        FinalDemoChild finalDemoChildObject = new FinalDemoChild(15);

        // override the final method in the child class will give compilation error)
       
        // finalDemoChildObject.method2();
    }








}
