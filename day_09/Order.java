class   Order{
	
public static void  main(String args[]){
System.out.println("=============================");
System.out.println("  Welcome to Order Online!  ");
System.out.println("=============================");
System.out.println("stat Main Method");
System.out.println("____________________________________");

System.out.println("This is Order class");
String result = Order.placeOrder("Apple17 pro" ,"Apple", 1 );
System.out.println("Result is " + result);
System.out.println("____________________________________");


   }

public static String placeOrder (String itemName, String brandName, int quantity){
System.out.println("Place order for an item:- " + itemName);
System.out.println("Company Name :-  " + brandName);
System.out.println("item Quantity:- " + quantity);
        return "Order has been placed. your order id is :-  APPLEX2345";
		




     }


}