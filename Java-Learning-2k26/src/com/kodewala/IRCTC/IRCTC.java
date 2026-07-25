package com.kodewala.IRCTC;

public class IRCTC {
	public static void main(String[] args) {
		String userType = "Student";

		switch (userType) {
		case "Retail":
			System.out.println(" you book only 6 Ticktes");
			break;
		case "Agent":
			System.out.println("you can book Unlimited Tickets");
			break;

		case "Student":
			System.out.println("You can Book Emergency Tckets");
			break;

		default:
			System.out.println("unkonwn Users");

			break;
		}
	}

}
