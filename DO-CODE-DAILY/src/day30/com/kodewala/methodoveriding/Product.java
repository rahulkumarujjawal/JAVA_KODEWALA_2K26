package day30.com.kodewala.methodoveriding;

public class Product {
	 public void pay(double amount) {
	        System.out.println("Payment Successful");
	    }

}

class Payment extends Product{
    @Override
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }

	
}
class UPIPayment extends Payment {
    @Override
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }

	
}


class CreditCardPayment extends UPIPayment {
    @Override
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }

	
	
	
}