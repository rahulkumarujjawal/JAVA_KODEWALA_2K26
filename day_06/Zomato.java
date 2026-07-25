class ZommatoOrders{
                public static void main(String args[]){

System.out.println("========================");
System.out.println("  WELCOME TO DAY_06");
System.out.println("    ORDER DETAILS");
System.out.println("=======================");

int orderId = Integer.parseInt(args[0]);
String productName = args[1];
double price = Double.parseDouble(args[2]);
double gst = Double.parseDouble(args[3]);

String customerName =args[4];
String pickupAddress = args[5];
String deliveryAddress  = args[6];
String deliveryStatus = args[7];

long  customerMobileNumber = Long.parseLong(args[8]);
boolean openBoxDelivery = Boolean.parseBoolean(args[9]);
String customerReview = args[10];
double totalCartValue =  price  + gst ;

System.out.println("--------------------------------------");


System.out.println("Order Id :- " + orderId);
System.out.println("Product Name :- " +productName);
System.out.println("Price :- " + price);
System.out.println("Gst :- "+ gst);
System.out.println("Customer_Name :- " + customerName);
System.out.println(" Pickup_Address :- "+ pickupAddress);


System.out.println("--------------------------------------");

System.out.println("enter_your_address :- "+ deliveryAddress) ;
System.out.println("Your_Status  :- " + deliveryStatus );
System.out.println("Mobile_Number:- "+ customerMobileNumber);
System.out.println("open_box :- " + openBoxDelivery);
System.out.println("Review :- " + customerReview);
System.out.println("Total Cart Value :- " + totalCartValue);


System.out.println("======================================");
System.out.println("         THANK YOU !!!");
System.out.println("======================================");



    }
}

