package com.functionaLInterfaces;

interface  IDiscountFlipcart1
{
	int apply(int amount,String coupleCode);
	
}

public class IDiscountFlipcart {

	public static void main(String[] args) {
		IDiscountFlipcart1 iDiscountFlipcart = (_amount, _coupnCode) -> {
			
	if (_coupnCode.equals("save20")) {
		return _amount - (_amount  * 20/100);
		
	}	
		return _amount;
		
			
		};
		int totalOff = iDiscountFlipcart.apply(1000, "save20");
		System.out.println("Your Discouint :- " + totalOff);
		
	}
}
