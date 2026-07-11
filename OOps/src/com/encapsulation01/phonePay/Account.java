package com.encapsulation01.phonePay;

public class Account {

    public static void main(String[] args) {

        User phUser = new User();

        phUser.setName("Madhu");
        phUser.setMobileNumber(9877683680L);
        phUser.setWalletBalance(5000);

        System.out.println("========= PhonePe =========");
        System.out.println("Name            : " + phUser.getName());
        System.out.println("Mobile Number   : " + phUser.getMobileNumber());

        System.out.println("\nWallet Balance Before : " + phUser.getWalletBalance());

        phUser.addMoney(25000);

        System.out.println("Wallet Balance After  : " + phUser.getWalletBalance());
        System.out.println("Payemnt has been Sucessfull ");

    }
}