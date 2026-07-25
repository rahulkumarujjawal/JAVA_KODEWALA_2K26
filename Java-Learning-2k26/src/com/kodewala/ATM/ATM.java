package com.kodewala.ATM;

public class ATM {
	public static void main(String[] args) {
		int option = Integer.parseInt(args[0]);
		String output = atmOpertion(option);
		System.out.println(output);

	}

	public static String atmOpertion(int option) {
		String message = "";
		switch (option) {
		case 1:
			message = checkBalance();
			break;

		case 2:
			message = depositeMoney();
			break;

		case 3:
			message = withdrawMoney();
			break;
		case 4:
			message = miniStatement();
		case 5:
			message = invalidOperation();
		default:
			break;
		}
		return message;

	}

	public static String checkBalance() {
		return "your balance is Rs. 50,0000";
	}

	public static String depositeMoney() {
		return "Rs.5,000 Deposited Sucessfully !";
	}

	public static String withdrawMoney() {
		return "Rs.2,000 Withdraw Sucessfully !";
	}

	public static String miniStatement() {
		return "Mini Statemnt Printed !";
	}

	public static String invalidOperation() {
		return "Invalid ATM Option !";
	}
}
