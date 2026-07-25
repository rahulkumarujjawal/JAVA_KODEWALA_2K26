package com.kodewala.model;

public class Book extends Product {
	String author;
	String genre;

	@Override
	public void acceptDetails() {

		productId = 301;
		productName = "Java Programming";
		price = 1000;

		author = "Kodewala";
		genre = "Programming";

	}

	  @Override
	  public void displayDetails() {
		super.displayDetails();
        System.out.println("Author :- " + author);
		System.out.println("Genre  :- " + genre);

}

	@Override
	public double calculateDiscount()
	{
    return price - (price * 0.05);

	}

}
