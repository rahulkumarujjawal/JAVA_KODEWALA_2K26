package com.kodewala.irct.booking;

public class Booking {
	public static void bookingRailwayTicket(String userType, int numbersOfTickets) {
		switch (userType) {
		
		case "reatil":
			validateBooking(userType, numbersOfTickets);
			break;

			
			
		case "agent":
			validateBooking(userType,numbersOfTickets);
			break;

			

		default:
			System.out.println("Unknown users .......");
			break;
		}

 	}

	private static void validateBooking(String _userType, int _numbersOfTickets) {
		if (_userType.equals("reatil")) {
			System.out.println("Max Ticket Allowed are 6 and you  have requested :------" + _numbersOfTickets);

		} else {
			System.out.println("user can book any numbers of tickets ");
		}

	}
}
