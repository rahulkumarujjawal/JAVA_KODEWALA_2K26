package com.kodewala.Methods;

public class BankStatement {

	public static void main(String[] args) {
		System.out.println("Weclome to SBI Bank ");

		BankStatement.checkBalance();
		BankStatement.depositMoney(5000);
		BankStatement.withDrawalMoney(2000);
		BankStatement.printThankYou();
	}

	public static void checkBalance() {
		System.out.println("Current Balance :- 10000");
	}

	public static void depositMoney(int amount) {
		System.out.println("Depoaited = " + amount);
	}

	public static void withDrawalMoney(int amount) {
		System.out.println("Withdraw = " + amount);

	}

	public static void printThankYou() {
		System.out.println("Thank You For Using SBI ATM");

	}
}
