package com.functionaLInterfaces;


interface IElectricBill{
	  double currentBill(int units,double pricePerUnit);
}





public class IElectricBills {
	public static void main(String[] args) {
		IElectricBill bill = (_units, _pricePerUnit) -> {
			double totalBill =  _units * _pricePerUnit;
			return totalBill;
			
		};
		
		double  finalBill = bill.currentBill(250, 8.50);
		System.out.println("Electricity Bill :- " + finalBill);
		
	}

}
