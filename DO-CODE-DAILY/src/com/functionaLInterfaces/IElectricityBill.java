package com.functionaLInterfaces;

interface ElectricBill{
	double genrateBill(int  units,double pricePerUnit);
}



public class IElectricityBill {

	public static void main(String[] args) {
		ElectricBill electricBill = (_units,__pricePerUnit) ->{
			double amount  = _units * __pricePerUnit;
			double gst = amount * 18 /100;
			return amount + gst;
			
			
		};
		
		System.out.println("-------------------------------");

		double totalYourBill = electricBill.genrateBill(950, 22.50);
		System.out.println("Your Electricity  Bill :- " + totalYourBill);
		System.out.println("===Thnak You===");
		
		System.out.println("--------------------------------");
	}
}
