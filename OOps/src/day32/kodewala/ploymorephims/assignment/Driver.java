/*




package day32.kodewala.ploymorephims.assignment;

public class Driver {
	public static void main(String[] args) {
		
		System.out.println("=====Email=========");
		
		Notification  notification1 = new Notification();
		notification1.sendNotification(); 
		// compile time :sendNotifications in Notifications in class 
		//runtime   :- calls the sendNotifications() of  the notifications 
		
		
		

		Notification notification2 = new EmailNotification();         // Parent class is referring child class object,
		
		// compile time :sendNotifications  in Notifications in class 
		notification2.sendNotification();   
		//runtime   :- calls the sendNotifications() of   the EmailNotifications 



		
		System.out.println("===== SMS =====");

       //  notification = new SMSNotification();
		Notification notification3 = new SMSNotification();
		notification3.sendNotification();
		
		// compile time :sendNotifications in Notifications in class 
		//runtime   :- calls the sendNotifications() of   the SMSNotifications 
		
		
		 

		

		

        notification2.sendNotification();

        System.out.println();

        System.out.println("===== PUSH =====");

       //  notification = new PushNotification();

        notification1.sendNotification();
        
        NotificationProcessor notificationProcessor = new NotificationProcessor();
       notificationProcessor.processNotifications(notification2);
       notificationProcessor.processNotifications(notification1);
       notificationProcessor.processNotifications(notification2);
        
        
       

	}

}




*/