package com.kodewala.sbi.user2;

class PaymentSystem extends Object { // parents of this classs --- objects class -- java lang package available in
										// objects class
	public PaymentSystem(String status) { // this is constructor
		super();
	}
}

class Payment extends PaymentSystem {
	public Payment() { // this is constructor
		super("Active");
	}

}

class UPIPayments extends Payment { // UPIPayments -- child class // Payment -- parents class
	public UPIPayments() { // this is constructor
		super();
	}
}

public class Driver {

	public static void main(String[] args) {
		UPIPayments upiPayments = new UPIPayments();
		System.out.println(upiPayments);

	}

}
/*
 * Source code --> compile -- byte code -- decompile == convert byte code to
 * source code go to google decompile java online
 * 
 * how to run == > then call will go line numbers 18 public UPIPayments() then
 * ==> 11 public Payment() Whatever object you're creating, I created object UP
 * 
 * class. Ultimately, call went till… object classes. First, it will initialize
 * the object. Then it will end in this class. Then if we dislike this class.
 * Then you pay. Okay? That means, to create this object, all these parents
 * would be initialized first. That is why… Java introduced a constructor
 * chaining concept. Constructor chaining concept.
 * 
 * 
 * Whenever you're creating object, it should initialize all the superclasses or
 * parent class. Then only that class object will be created because until this
 * parent doesn't exist, child cannot exist in this world.
 * 
 * 
 * What will be the default statement? Super with no args Child class = Subclass
 * Superclass is the parent class from which another class inherits properties
 * and methods.
 * 
 */