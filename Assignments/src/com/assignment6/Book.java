//Write a program for class and object : (initialization through method)
package com.assignment6;

public class Book {
	 private String title;
	    private String author;
	    private int pages;

	    
	    public void viewData(String bookTitle, String bookAuthor, int bookPages) {
	       
	        this.title = bookTitle;
	        this.author = bookAuthor;
	        this.pages = bookPages;
	    }

	    
	    public void displayInfo() {
	        System.out.println("Book Title: " + this.title);
	        System.out.println("Book Author: " + this.author);
	        System.out.println("Number of Pages: " + this.pages);
	    }

	    public static void main(String[] args) {
	       
	        Book book = new Book();

	        
	        book.viewData("The Catcher in the Rye", "J.D. Salinger", 224);

	        
	        book.displayInfo();
	    }
	}


