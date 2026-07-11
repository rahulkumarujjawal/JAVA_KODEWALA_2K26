package com.encapsulation01.phonePay;

public class User {

    private String name;
    private long mobileNumber;
    private int walletBalance;

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

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    // Deposit Money
    public void addMoney(int amount) {

        System.out.println("-----------------------------------");
        System.out.println("Current Balance : " + walletBalance);

        walletBalance = walletBalance + amount;

        System.out.println("Money Added     : " + amount);
        System.out.println("Updated Balance : " + walletBalance);
        System.out.println("-----------------------------------");
    }

}