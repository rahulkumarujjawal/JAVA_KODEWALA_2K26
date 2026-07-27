package com.functionaLInterfaces;

interface  Subtract1 {
	
	int Subtract(int number1 , int Number2);
	
}
public class Subtract {
	public static void main(String[] args) {
		Subtract1 subtract = (num1, num2) -> {
			int sum = num1 - num2;
			return sum;
			
			
		};
		int result  = subtract.Subtract(80, 30);
		System.out.println(result);
	}

}
