package com.amazon.user;

public class User {
	private String userName;
	private String usrId;
	private String mobileNumbers;
	private String email;

	

	
	
	
	
	static {
		System.out.println("User -- static block"); // this is will get executed just after loading the class
	}
	
	
	{
		System.out.println("User IIB");    // iib
	}
	
	

	public User(String _UserId) {
		// 1st line either super and this
		this("guest user", _UserId, "76773737332", "rahuluser@gmail.com"); // settings mandatory Fields
		
		// 2nd line -- call to iib
		System.out.println("User.User()--1");

		// this here same class as a constructors
	}

	
	
	
	
	public User(String userName, String usrId, String mobileNumbers, String emial) {

		super(); // by defalut
		
		// CALL TO IIB 
		System.out.println("User.User()--2");

		this.userName = userName;
		this.usrId = usrId;
		this.mobileNumbers = mobileNumbers;
		this.email = email;

	}
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("Driver Main Method()");
		User Ujjawal = new User("dwdn-dnwidmnwnwi-jsisjws-jshw");
		User RAHUL = new User("dwdn-dnwidmnwnwi-jsisjws-jshw");


	}

}
