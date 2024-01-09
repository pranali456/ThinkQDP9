package com.overriding;


class Company{
	
  void address() {
    System.out.println("Company address: 123 Main Street, City");
}
}

  class eBay extends Company {


   void address() {
    System.out.println("eBay address: 456 Commerce Lane, Mega City");
}
}

  public class CompanyDemo {
    public static void main(String[] args) {
    Company company = new Company();
    company.address();  

    eBay ebay = new eBay();
    ebay.address(); 
}
}











