package com.kodewala.irctc.user;

public class IRCTCUser {
	private String passengerName;
	private String userId;
	private String source;
	private String destination;

	IRCTCUser() {
		System.out.println("I am Inside IRCTCUser()");

	}

	IRCTCUser(String _passengerName, String _userId, String _source, String _destination) {
		System.out.println("IRCTC Constructor Called");
		passengerName = _passengerName;
		userId = _userId;
		source = _source;
		destination = _destination;

	}

	public static void main(String[] args) {
		System.out.println("IRCTC User.main() START()");
		IRCTCUser rahul = new IRCTCUser("rahul ujjawal", "10102", "daltonganj", "delhi");
		System.out.println("IRCTC User will be main().end");

	}

}
