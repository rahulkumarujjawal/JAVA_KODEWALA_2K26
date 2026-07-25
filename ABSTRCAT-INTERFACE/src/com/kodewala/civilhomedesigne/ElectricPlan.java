package com.kodewala.civilhomedesigne;

public class ElectricPlan implements HomeDesigne {

	@Override
	public void homeDeatils() {
		System.out.println("homeDeatils.Home Location :- Near by silk Board");

	}

	@Override
	public void homeWindow() {
		System.out.println("Home Window.Total Window :- 22");
	}

	@Override
	public void homeGate() {
		System.out.println("Home gate. Gate:- North Side");

	}

	@Override
	public void electricDetails() {
		System.out.println("electricDetails().all are Dc and Ac");
	}

	@Override
	public void plumbingDeatils() {
		System.out.println("Only used For Jugwar");

	}

	@Override
	public void colorDetails() {
		System.out.println("colorDetails().color :- Red green ");
	}

	@Override
	public void kitchenDeatail() {
		System.out.println("KitchenDetails :- fully Furnished");

	}

	@Override
	public void parkingDeatils() {
		System.out.println("Parkig : - All Types allowed Vechiles ");

	}

}
