class AmazonOrderSystem
         {
           public static void main(String args[])
		   {
		
System.out.println("======================");
System.out.println("  WELCOME TO DAY_06  ");
System.out.println("  Amazon_Order_System  ");
System.out.println("=======================");


long orderId = 10002022;
String productName = "apple_laptop_macbook_air";
double price = 75000;
double gst = 2200.0;
double discountPercentage = 20.0;
double discountAmount = (price * discountPercentage) / 100;
double finalPrice = price - discountAmount + gst;
long cutomerMobileNumbers = 8709949334L;
boolean openBoxDelivery =  false;
String customerReview  = "it was very good";
String customerName = "Rahul ujjawal sharma";
String pickupAddress =  " Apple_Store";
String deliveryAddress  =  "Near by silk board address";
String deliveryStatus =  "On the way";


System.out.println("Order Id :- " + orderId);
System.out.println("Product Name :- " + productName);
System.out.println("Price :- "+ price);
System.out.println("Gst  :- " + gst);
System.out.println("--------------------------------");
System.out.println("Discount :- " + discountPercentage);
System.out.println("Total Discount Amount :- " +  discountAmount);
System.out.println("Final Price :-  " + finalPrice );
System.out.println("Mobile Numbers :- " + cutomerMobileNumbers);
System.out.println("Open Box Delivery :- " + openBoxDelivery);
System.out.println("--------------------------------");
System.out.println("Customer Review :- " + customerReview);
System.out.println("Customer Name  :- " + customerName);
System.out.println("Pickup Address :- " + pickupAddress );
System.out.println("Delivery Address :- "+ deliveryAddress);
System.out.println("Delivery Status:- " +  deliveryStatus);


System.out.println("======================================");
System.out.println("         Thank You ! ! !");
System.out.println("======================================");




		
		 }


 }