package com.interfaces.banking;

public interface IBankingSystem {   // this is 15 years back
	
	public void pay();
	public void settle();
	public void stopTxn();
	
	//  now change the contract :- 
	// from java 8 onwords, we can write default method.(Optional)
	public default  void printPassBook()    		           // should be implemented by rural bank only  bankof jharkhand and rural
	{
		
		System.out.println("IBankingSystem.printPassBok()");
		
// Whichever class you want, take it. Somebody do not want? Don't take it.
// Using default method, you can… You can launch optional functionality. and add new functionallity 		
// interface will not… existing classes will not be modified. Your existing classes will not be modified. Whoever really want the feature, they can take it.
//	Whoever really want the feature, they can	
		
// what is different between absolute class and interface?	  
	}
	

}

/*
 * If you are changing something in system.
This doesn't affect your existing users.
This works for the new user, as well, it works for the bold users. So here, more user classes.
So, you change some functionality?
5 classes got modified, rural bank, remaining 15 is not modified, your system is working as is without any.
problem. So, default, Method in interface got introduced to?
Solve the backward compatibility issue.
So I did… Bacquired compatibility suit. That means…
Was it launches in your region?

when do you decide to interface?
When you know that, okay, these funds will be high, you must be implemented.
What?
And you won't have that time, any Konal function at it.
That can include any common functionality. That's… that takes the world for 5 years.
In future, some partial requirement came.
In future, some passing requirement came, okay, this should be implemented by only 3 classes.
In that case, in future, you will introduce
D for impact, just to achieve backward competition.
From the level and the design interface, you will not be introducing default methods.
If you have such a requirement, you should go with extra class.
If you have such a requirement, you should go with Apps. The interface still remains 100% contact-based.
Let's say your math on Sunday, and you go that away. Only 10 are not mandatory. Only 7 are mandatory, 3 are optional. I don't go with 7 abstract, and 3 default. No.
Before we capture class. Before we capture class, okay?
When you design an interface, you have all the requirements of the action.
Definitely a respondent list. In future.
something comes, somebody's forcing from RDA or somebody, external party, says that, okay, launch new Twitter.
Must be implemented, or must be available only for the past year classes.
D?
To achieve the record confidence in what do you do?
We will introduce this one and keep you.

e backward compatibility.


The default… to achieve the backward competitive. Now.
 * 
 * 
 * 
 * 
 * 
 * achieve the backward… this will help us to achieve the backward compatibility. When we already designed the interface.
We got the requirement that those requirements are not applicable to all the classes.
Maybe some of the classes require those functionalities with help of the default, you will.
achieve the backward compatibility and launch the new features.



default method will have… default method will have body.

And classes who are want , they are  override it, and they use the
default method. 


And what kind of changes they have done. They have introduced a method called default method.
 * 15 Years -- 2026 please add  print add new feature  :- printing passbook only for Bnak Of JHARKHAND 
 */
