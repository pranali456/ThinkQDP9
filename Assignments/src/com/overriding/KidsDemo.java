package com.overriding;



class Kid{
	
	
	void readBook() {
        System.out.println("Kid is reading a book");
    }

    
    void readBook(String bookTitle, String author) {
        System.out.println("Kid is reading '" + bookTitle + "' by " + author);
    }
}

class BigKid extends Kid {
   
   
    void readBook() {
        System.out.println("BigKid is reading a thicker book");
    }
}

public class KidsDemo {
    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.readBook();
        kid.readBook("Harry Potter", "J.K. Rowling");

        BigKid bigKid = new BigKid();
        bigKid.readBook();
        bigKid.readBook("Lord of the Rings", "J.R.R. Tolkien");
    }
}