package com.bankOfIndia.user;

import com.bankOfIndia.account.Account;

public class User {
	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(500);
		System.out.println("Before Modification :-  "  + account.getBalance());  // Default the values 
		
		
		
		account.setBalance(20000);  // Directly setting or Modifying  the balance
		
		System.out.println("After Modification :- "+account.getBalance());
	}

}
