package com.functionaLInterfaces;

@FunctionalInterface
interface IAddingNumber{
	 int addNumber(int num1,int num2);
	 
}



public class IAddingNumber1 {
	public static void main(String[] args)
	{
		IAddingNumber addingNumber =  (num1, num2) -> 
		{
			int addTwoNumber = num1 + num2;
			return addTwoNumber;
			
		};
		
		
		int result = addingNumber.addNumber(20, 40);
		System.out.println(result);
	}

}
