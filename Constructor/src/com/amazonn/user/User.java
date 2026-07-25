package com.amazonn.user;

public class User {
	private String userName;
	private String userId;
	private String mobile;

	private String email;

	public User(String _userId) {
		this("guest user", _userId, "0000000", "abcd@gmail.com");  // seetting mandotry field

		System.out.print("User.User() -1");

	}

	public User(String userName, String userId, String mobile, String email) {
		super();
		System.out.println("User.User() -2");
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		this.email = email;
	}

}
