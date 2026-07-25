package com.abstracts.interfaces;

public  abstract  class PaymentSystem {
	
// :- These are not implemented. These are just… this class want These functionality must be implemented by child class.
// have abstract method, which method will be implemented by your child class. 
// Abstract method will terminate with semicolon There's no body, this body's not there.
	
	
	// setting up  --
	public abstract void pay();                          
	public abstract void sucesspendPayment();
	public abstract void stopPayment();
	
	
	
	
	 public void  checkStatus() 
	{                                                       // this functions implemented by payment system class.
	System.out.println("PaymentSystem.checkStatus");   
	//  concrete Method, as well as Body.
	
	
	
	}
    // add after one year
		public abstract void checkLimit();

	 
	 
	 /*	 
	 
what is purpose of abstract class? ==> Setting a partial contract.
 
At the same time, you want to provide some common functionality,==> so that your all-child can use it.
 
what is purpose of abstract class ==>  Setting a partial contract. will be writing? Non-abstract or concrete method.
Whenever you want to give some functionalities,
 
For child class to implement. And some common functionality you're going to implement. ==> You're going to? implement
   
this class knows that, how to check the status. 
This is a common functionality. How to check the…
 
Status, it's common function, doesn't differ between	
functionality doesn't differ between the classes, so that's why I have
put this common functionality. 
So,

 abstract class==>  will have abstract method, as well as…Concrete method. 
 Concrete method is nothing? The common functionality you want to provide to all your child classes.	 

if you are requiring them to set up a partial contract, that means you're asking child class to implement
you're asking child class to implement. But at the same time, you are providing some constraints.



Uniform contract. Now, everybody, 20 classes gave 20 different names for the same functionality?
20 different names for?
Sam?
Functionality. 















 
I decided that payment to be done in my system, right? Then credit card payment will have a method called
payment 
This class will have…

Money transfer.   

Now, this is a problem in the large system, right? This is a problem in large system. People don't understand later what is meaning of money transfer versus what is meaning of…
Payment.
Now you have 20 classes,

everybody will be using their own naming constants and their own name.
Inside that same functionality. Inside that same functionality. So why can't we force them? Why can't we?
force them. Let's have abstract class,


Inside that same functionality. Inside that same functionality. So why can't we force them? Why can't we?
force them. Let's have abstract class, and ask them to Implement it. Ask them to?

what we are doing.
We are forcing our child classes to… follow certain… Rules or norms? 
This pay method got 20 different names in 20 different classes. Wallet got something else, ATL money got something else, credit card got something else. But at the end of the day, purpose is paying only, right? Then why can't we use public-wide pay, or public bullion, or public something pay? Correct? 





 */

}
