package com.hdfc.banking.system;

public class Payment {

	public void doPayment() {
		System.out.println("Payment.doPayment() ..... Doing Pay Payment");
	}

}

class UPIPayment extends Payment {

	@Override
	public void doPayment() {
		System.out.println("Payment.UPIPayment() ..... Doing UPI Payment");
	}

}

class CardPayment extends Payment {

	@Override
	public void doPayment() {
		System.out.println("Payment.CardPayment() ..... Doing Card Payment");
	}

}

class DebitCardPayment extends Payment {

	@Override
	public void doPayment() {
		System.out.println("Payment.DebitCardPayment() ..... Doing  DebitCard Payment");
	}

}

class GooglePayPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("Payment.GooglePayPayment() ..... Doing  GooglePay Payment");
	}

}

class PayteamPayment extends Payment {
	@Override
	public void doPayment() {
		System.out.println("Payment.PayteamPayment() ..... Doing  Payteam  Payment");
	}

}

class CreditCardPayemnt extends Payment {
	
	@Override
	public void doPayment() {
		System.out.println("Payment.CreditCardPayment() ..... Doing  CreditCard  Payment");
	}
	
	
}

class SbICardPayment extends Payment {
	
	@Override
	 public void doPayment() {
		System.out.println("Payment.SbiCreditCardPayment() ...  Doing Sbi Card Payment");
		 
	 }
}