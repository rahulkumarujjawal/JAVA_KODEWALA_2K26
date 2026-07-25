package day31.kodewala.ploymorephims;

class FlipkartDelivery {
	public void estimateTime(String source, String Destination) { // static methods are hiiden in child class
		System.out.println("Delivery.estTime(String source, String Destination");
	}

}

class ExpDelivery extends FlipkartDelivery {
	
    @Override
	public void estimateTime(String source, String Destination) {
		System.out.println("Delivery.estTime(String source, String Destination"); // static methods are hiiden in child
																					// class
	}

}

public class Driver4 {
	public static void main(String[] args) {
		ExpDelivery delivery = new ExpDelivery();
		delivery.estimateTime("Ranchi ", "Daltonganj");

	}  
}


/*
 * 
 * Compiler do not know about object creation. So what compiler will see here?
You're calling a method of at the compile time. Okay, you're calling a method of.
This type compiler doesn't know what is this object, right?
Company knows that, okay, on delivery class reference, you are calling estimate time method.
this method should be available. So, at the time, At the time of… At the time of compilation.
it will… Check.
 */
