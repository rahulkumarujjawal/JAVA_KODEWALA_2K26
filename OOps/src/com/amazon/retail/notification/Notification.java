package com.amazon.retail.notification;

public class Notification {
	 
	// properties   of own class + properties of  object class  
	public String fromAdress =  "from Benglore";
	
	// its own properties  + notification  properties + Object class every class in Java will be
	// able to Access object class property.
	
	public void sendNotification( String email,String from) {
		System.out.println("Sending Notification ......");
		
	}

}
