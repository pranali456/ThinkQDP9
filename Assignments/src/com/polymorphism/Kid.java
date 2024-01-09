package com.polymorphism;

public class Kid {
	
	void readBook()
	{
		System.out.println("harry poter");
	}
	
	void readBook(String bookTitle, String author)
	{
		 System.out.println("Kid is reading '" + bookTitle + "' by " + author + ".");
	}

	public static void main(String[] args) {
		Kid book = new Kid();
		book.readBook();
		book.readBook("Christmas pig", "JK Rowling");
		

	}

}
