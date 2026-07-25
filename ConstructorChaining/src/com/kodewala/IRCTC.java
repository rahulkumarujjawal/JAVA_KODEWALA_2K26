package com.kodewala;

public class IRCTC {
	public static void main(String[] args) {
		String userType = args[0];
		int ticketCount=Integer.parseInt(args[1]);
		
		String output=ticketBooking(userType,ticketCount);
		System.out.println(output);
		
	}

	
	public static String ticketBooking(String userType,int ticketCount) {
	    String message = null;
	    switch (userType) {
	    case "Retail":
	        if (ticketCount > 6) {
	            message = "ticket booking limit for that day is full see you tomorrow";
	        } else {
	            message = "ticket is booking by reatial user";
	        }
	        break;
	    case "Agent":
	        message = "ticket is booking from Agent user it will book any number of ticket";
	        break;
	    default:
	        message = "Unknown user";
	        break;
	    }
	    return message;
	}
}
