package day31.kodewala.overloadingmethod;

public class Driver2 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.openAccount(7373838, 838383838);

	}

}

class Bank {

	public void openAccount() {
		System.out.println("=====================");
	}

	public String openAccount(int id, String accountName) {
		System.out.println("Your Account Deatisl().int id,String accountName");
		System.out.println("Your Details:-  1010    Rahul Ujjawal");
		return "Account sucessfully Login";
	}

	public void openAccount(int id, String accountName, String location) {
		System.out.println("Your Account Deatisl().int id,String accountName");
	}

	public void openAccount(int id, String accountName, int age) {
		System.out.println("Your Account Deatisl().int id,String accountName");
	}

	public void openAccount(int id, int password) {
		System.out.println("Your Account Deatisl().int id,String accountName");

	}

	public void openAccount(int loginId, int password, int balance) {
		System.out.println("Your Account Deatisl().int id,String accountName");
	}

}