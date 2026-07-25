package day32.kodewala.ploymorephims.assignment;

public class Notification {

	public void sendNotification() {

		System.out.println("Sending  Notification...");

	}

}

class EmailNotification extends Notification {
	@Override
	public void sendNotification() {

     System.out.println("E-mail Notification Sent Successfully.");

	}

}

class SMSNotification extends Notification {
	@Override
    public void sendNotification() {

        System.out.println("SMS Notification Sent Successfully.");

    }

}

class PushNotification extends Notification {
	
	@Override
    public void sendNotification() {

        System.out.println("Push Notification Sent Successfully.");

    }
}
class WhatsAppNotification  extends Notification{
	@Override
	public void sendNotification() {
		System.out.println("Whatsapp Notification send Sucessfully ");
		
	}
}

class Driver {
	public static void main(String[] args) {
		
		
		Notification notification1 = new Notification();
		// Compile time :- sendNotifications in Notifications in class 
		//Runtime :- calls the sendNotifications() of  the notifications 
         notification1.sendNotification();
		
	    Notification notification2  = new EmailNotification();     // Parent class is referring child class object,
		// Compile time :- sendNotifications in Notifications in class 
		//Runtime :- calls the sendNotifications() of  the EmailNotifications 
         notification2.sendNotification();
		
		Notification notification3 = new SMSNotification();       // Parent class is referring child class object,
		// Compile time :- sendNotifications in Notifications in class 
		//Runtime :- calls the sendNotifications() of  the SMSNotifications 
         notification3.sendNotification();
         
        Notification notification4 = new PushNotification();            // Parent class is referring child class object,
		// Compile time :sendNotifications in Notifications in class 
		//Runtime :- calls the sendNotifications() of  the PUSHNotifications 

		

		notification4.sendNotification();
		   
		Notification notification5 = new  WhatsAppNotification();          // Parent class is referring child class object,
		// Compile time :sendNotifications in Notifications in class 
		//Runtime :- calls the sendNotifications() of  the WhatsAppNotifications 

        notification5.sendNotification();  //   which method --> Decision. Happens at… Runtime. calls Runtime  This is called runtime polymorphism runtime.  
		  //   the based on actual object 
	}
}
