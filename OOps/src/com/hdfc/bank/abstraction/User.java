package com.hdfc.bank.abstraction;

public class User {
	public static void main(String[] args)

	{
		PayementProcessor payementProcessor = new PayementProcessor();
		int balance = payementProcessor.checkBalance("aewr@1929", "hsjsj@18228");
		System.out.println("Your balance is :- " + balance);
	}

}
