package com.amazon.reseller.notification;

import com.amazon.retail.notification.Notification;

public class ResellerNotification extends Notification {

	public static void main(String[] args) {
		
		ResellerNotification notification = new ResellerNotification();
		System.out.println(notification.fromAdress); // from parent class reusing it 
		notification.sendNotification("rahul@gmail.com", "no-replay.@amazon,com ");

	}

}
