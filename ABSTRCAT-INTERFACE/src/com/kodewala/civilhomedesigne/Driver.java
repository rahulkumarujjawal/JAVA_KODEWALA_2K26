package com.kodewala.civilhomedesigne;

public class Driver {
	public static void main(String[] args)
	{
		HomeDesigne homeDesigne;
		homeDesigne = new ElectricPlan();
		
		
		homeDesigne.homeDeatils();
		homeDesigne.electricDetails();
		System.out.println();

		homeDesigne.colorDetails();
		homeDesigne.homeWindow();
		System.out.println();

		homeDesigne.kitchenDeatail();
		
		
		homeDesigne = new KitchenArea();
		
	}

}
