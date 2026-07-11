package com.encapsulation.Account;

public class Account {

	private String name;
	private long mobileNumber;
	private String password;
	private int walletBalance;
	private boolean accouuntBalance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(int walletBalance) {
		this.walletBalance = walletBalance;
	}

	public boolean isAccouuntBalance() {
		return accouuntBalance;
	}

	public void setAccouuntBalance(boolean accouuntBalance) {
		this.accouuntBalance = accouuntBalance;
	}

	public void addMoney(int amount) {
		System.out.println("==========Add Money===========");
		System.out.println("Wallet Balance Before add Money :-" + walletBalance);
		if (amount > 500) {
			walletBalance = walletBalance + amount;
			System.out.println("Amount Addedd :- " + walletBalance);

		} else {
			System.out.println("Invalid amout");
		}

	}

	public void sendMoney(int amount) {
		System.out.println("\n========== SEND MONEY ==========");
		System.out.println("Balance Before : " + walletBalance);
		if (amount > 0 && amount <= walletBalance) {
			walletBalance = walletBalance - amount;
			System.out.println("Amount Sent    : ₹" + amount);
			System.out.println("Balance After  : ₹" + walletBalance);

		} else {
			System.out.println("Transaction Failed");
			System.out.println("Insufficient Balance");
		}

	}

	public void updateMobileNumber(long newMobileNumber) {

		System.out.println("\n====== UPDATE MOBILE NUMBER ======");

		if (String.valueOf(newMobileNumber).length() == 10) {

			System.out.println("Old Mobile Number : " + mobileNumber);

			mobileNumber = newMobileNumber;

			System.out.println("New Mobile Number : " + mobileNumber);
			System.out.println("Mobile Number Updated Successfully");

		} else {

			System.out.println("Invalid Mobile Number");

		}

	}

	// 4. Change Password
	public void changePassword(String oldPassword, String newPassword) {

		System.out.println("\n========== CHANGE PASSWORD ==========");

		if (password.equals(oldPassword)) {

			password = newPassword;

			System.out.println("Password Changed Successfully");

		} else {

			System.out.println("Old Password is Incorrect");

		}

	}

	// 5. Deactivate Account
	public void deactivateAccount() {

		System.out.println("\n========== DEACTIVATE ACCOUNT ==========");

		boolean accountActive = false;

		System.out.println("Your PhonePe Account is Deactivated.");

	}

	// Display Details
	public void displayUser() {

		System.out.println("\n========== USER DETAILS ==========");
		System.out.println("Name           : " + name);
		System.out.println("Mobile Number  : " + mobileNumber);
		System.out.println("Wallet Balance : ₹" + walletBalance);
		System.out.println("Account Active : " + name);

	}

}
