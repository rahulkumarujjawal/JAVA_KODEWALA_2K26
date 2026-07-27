package com.functionaLInterfaces;

interface IMultipaleNumbers {
	int multiply(int num1, int num2);
}

public class IMultipaleNumbers1 {
	public static void main(String[] args) {
		IMultipaleNumbers multipaleNumbers = (num1, num2) -> {
			int sum = num1  * num2;
			return sum;
			
			
		};
		
		
		int result = multipaleNumbers.multiply(30, 4);
		System.out.println(result);
	}

}
