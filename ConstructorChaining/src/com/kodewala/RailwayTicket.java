package com.kodewala;

public class RailwayTicket {
	public static void main(String[] args) {
		String userType = args[0];
		int numbersOfTickets = Integer.parseInt(args[1]);
		String countTicket = RailwayTicket.checkUserBookingType(userType, numbersOfTickets);
	}

	private static String checkUserBookingType(String userType, int numberOfTickets) {
		String userOutput = "";
		switch (userType) {
		case "Retail":
			if (numberOfTickets > 6) {
				userOutput = "Ticket Booking for reatils cutomers not allowed";

			} else if (numberOfTickets <= 6) {
				userOutput = "Ticket Booking allowed  for retails customers";

			}
			return userOutput;
		case "Agent":
			if (numberOfTickets >= 1) {
				userOutput = "The agent can book any numbers of Ticket in day";
			}

			break;

		default:
			userOutput = "Unknow person is not allowed";
		
		}
		return userOutput;

	}
}
