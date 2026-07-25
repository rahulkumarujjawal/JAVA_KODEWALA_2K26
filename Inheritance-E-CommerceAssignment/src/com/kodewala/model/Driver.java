package com.kodewala.model;

public class Driver {
	
	public static void main(String[] args) {
		Electronics electronics = new Electronics();
		
		electronics.acceptDetails();
        electronics.displayDetails();
        System.out.println("Final Price : " + electronics.calculateDiscount());
        
        
        System.out.println("-------------------------------------------------");
        
        Clothing clothting = new Clothing();
        clothting.acceptDetails();
        clothting.displayDetails();
        System.out.println("Final Price :- " +clothting.calculateDiscount());
        
        
        System.out.println("-------------------------------------------------");
        
        Book book = new Book();
        book.acceptDetails();
        book.displayDetails();
        System.out.println("Final Price :- " + book.calculateDiscount());
        
        
        System.out.println("---------------Thank You ----------------------");

        
        

        
      
        
      

	}

}
