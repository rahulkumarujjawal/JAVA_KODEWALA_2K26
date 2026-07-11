package com.encapsulation.Account;

public class Driver {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setName("RAHUL UJJAWAL");
		account.setMobileNumber(83637197109l);
		account.setWalletBalance(50000);
		account.setPassword("Rahul@1995");
		account.addMoney(5000);
		account.sendMoney(2500);
		account.updateMobileNumber(79797979797l);
		
		
		account.changePassword("Rahul@1995"  , "java@1995");
		account.deactivateAccount();
		account.displayUser();

	}

}
