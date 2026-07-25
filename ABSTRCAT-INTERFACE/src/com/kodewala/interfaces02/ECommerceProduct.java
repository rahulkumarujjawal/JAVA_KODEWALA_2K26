package com.kodewala.interfaces02;

public interface ECommerceProduct 
{
	public abstract void addProduct();

	public abstract void removeProduct();

	public abstract void displayProduct();

	public abstract void buyProduct();

	public abstract void addTOCart();
	
	


	// from java 8 onwards, we can write default method .(Optional)
	public default void premiumMembership() {

		System.out.println("Premium Membership Not Available");

	}

}
