package com.hotstar.user;

public class HotStarUser {

	static int totalViewers = 0;
	private String userId;
	private String type;

	public HotStarUser(String userId, String type) {
		this.userId = userId;
		this.type = type;

	}

	public HotStarUser(String userId) {
		this(userId, "free");

	}

	{
		// i will increse an counter/ number

		totalViewers = totalViewers + 1;
	}

	 void doSomething() {
		System.out.println("Hotstar USER.printSomething()");
	}
}
