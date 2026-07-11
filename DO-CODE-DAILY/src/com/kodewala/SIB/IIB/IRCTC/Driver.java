package com.kodewala.SIB.IIB.IRCTC;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		IRCTCUser user1 = new IRCTCUser("Rahul", "Delhi", "Mumbai",22,876888892);
        user1.bookTickets();
        IRCTCUser user2 = new IRCTCUser("ujjawal", "Patna", "Bangalore",8,88728828);
        user2.bookTickets();

        System.out.println("Main Method End");
		
		
		
	}

}
