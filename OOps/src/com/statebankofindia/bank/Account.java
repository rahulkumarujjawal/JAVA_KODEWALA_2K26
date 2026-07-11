package com.statebankofindia.bank;

public class Account {
	private int balance;
	private String name;

	public Account(int balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}

	// providing public setter if someone wants to modify the data
	public void deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}
	// providing public setter if someone wants to modify the data

	public void withdrawl(int amount) {
		if (amount <= amount) {
			balance = balance - amount;
		}else {
			System.out.println("Balance is low  ! ! ! ! ");
		}
	}

	// providing public getter if someone wants to modify the data

	public int checkBalance() {
		return balance;
	}
}

/*
 * 
 * Setter.This is the setter getter. Understood. You can have set balance also
 * you can do. Fine. Is this clear? So I'm doing in controlled way, I'm
 * controlling. I mean, this class is controlling. This class is not providing
 * direct access to other classes. Whenever somebody want to modify, whenever
 * ATU want to deposit, they will call this one. They cannot call this direct.
 * If it is a non-private or public. They can directly call without
 * authorization, it goes through.
 * 
 */