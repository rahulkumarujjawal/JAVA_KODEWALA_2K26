package com.encapsulation01.sbi;

import com.encapsulation01.Sbiuser.SbiUser;

public class SbiAccount {
	public static void main(String[] args) {
		SbiUser user = new SbiUser();
		
		user.setAccountNumber("3637829292");
		System.out.println("Account Number  :-  " + user.getAccountNumber());
		user.setBalance(50000);
		System.out.println(user.getBalance());
		


//        user.displayAccountDetails();
	}

	
}
