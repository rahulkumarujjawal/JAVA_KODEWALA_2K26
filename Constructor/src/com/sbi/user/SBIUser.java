package com.sbi.user;

public class SBIUser {

	
	// instance variables 
	private String name;
	private String userId;
	private String password;
	private int balance;

	SBIUser() { // constructor which does not expect any args
		System.out.println("i am in side SBIUser()");
	}

// local Variables 
	SBIUser(String _name,String _userId, String _password,int _balance){	
		System.out.println("SBIUser.SBIUser(String _name,String _userId, String _password,int _balance)");
		name = _name;
		userId = _userId;
		password = _password;
		balance = _balance;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("SBIUser.main() START");
		// create an object of SBIUser class
	//	SBIUser sbiUser = new SBIUser(); //  calling no argumnets of SBI users class
		
		SBIUser rahul = new SBIUser("rahul ujjawal","rahul12234","rahul@122",5500); // calling constructor of SBIuser class which 
		SBIUser ujjawal = new SBIUser("ujjawal sharma", "ujjawal123","ujjawal@123",6500);
		// type ref name = new Objects created for class SBIUser
		
		System.out.println("SBIUser.main()END");
	}

}
