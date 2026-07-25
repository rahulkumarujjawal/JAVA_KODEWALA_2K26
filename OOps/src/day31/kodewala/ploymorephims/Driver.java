package day31.kodewala.ploymorephims;

class Delivery { // super class
	public void estimateTime(String source, String Destination) { // static methods are hiiden in child class
		System.out.println("Delivery.estTime(String source, String Destination");
	}

}

class ExpressDelivery extends Delivery { // sub class
	public void estimateTime(String source, String Destination) {
		System.out.println("Delivery.estTime(String source, String Destination"); // static methods are hiiden in child
																					// class
	}

}

class OneDayDelivery extends ExpressDelivery {

	public void estimateTime(String source, String Destination) {
		System.out.println("Delivery.estTime(String source, String Destination"); // static methods are hiiden in child
																					// class
	}

}

public class Driver {

	public static void main(String[] args) {
		Delivery delivery = new OneDayDelivery(); // parent classs can refer child class object . situtaion 1
		/*
		 * compiler ---> at the time of compilation , it will check eastTime() exists in
		 * Delivery or not
		 * 
		 * 
		 * running ---> actual object is create --> expressDelivery class ,jvm will call
		 * the method of expressDelivery
		 * 
		 * 
		 * Runtime polymorphism? it's being achieved using… Method overriding. Method
		 * overriding is nothing runtime polymorphism. Why it is called runtime
		 * polymorphism? Because this decision… The decision to call. Why it is called Y
		 * runtime? more polymorphism why run time poly ---> Because the actual decision
		 * Happens at the runtime. And based on this actual object,type , the actual
		 * object is child class ExpressDelivery
		 * 
		 * Express deliveries, estimate time method. This decision taken at the runtime.
		 * Which method to be called? The decision taken at the? Runtime, that is why it
		 * is called Runtime. Polymorphism. Compile time it checked. Whether this method
		 * is there in this class or not, yes, runtime object got created. Then
		 * del.estimate will call this one. So this decision taken at the runtime, or it
		 * might be dynamic method dispatch as well. Based on this actual object type,
		 * this will call the method. Based on the actual object type, It will call the?
		 * method.
		 * 
		 * this is called polymorphism or runtime. polymorphism. How do you achieve
		 * runtime polymorph using overriding. Why it is called runtime? Because the
		 * decision happened which method to call. We have three methods, right?
		 * 
		 * 
		 * why it is called runtime polymorphism? Because actual method call Decided at
		 * the time. Running the application. Okay? And how they decided? Based on the
		 * actual object type, the actual object type is this one. So this class.
		 * estimate delivery blimp column. If it is not available, part of the
		 * inheritance, parent class
		 * 
		 * 
		 * 
		 * At the runtime, based on the actual object type, your method call happened.
		 * Now, when I was saying situation, this is situation one. situation.
		 * 
		 */

		delivery.estimateTime("Benglore", "Pune");

	}

}
