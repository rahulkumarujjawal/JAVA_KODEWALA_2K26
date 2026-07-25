class AmazonOrderSystem{
public static void main (String args[]){

String productName = args[0];
double price = Double.parseDouble(args[1]);
String cutomerName = args[2];
String cutomerType = args[3];

double discount = 0;
double deliveryCharge =50;

if (cutomerType.equals("Prime") && price >= 3000){
	discount  = price * 15 / 100;
	deliveryCharge = 0;
	
}

else if(cutomerType.equals("Prime") && price >= 1000){
	deliveryCharge = 0;
}

double totalAmount =(price -discount) +deliveryCharge;

System.out.println("=============================");

System.out.println("Customer  Name :- " +cutomerName);
System.out.println("Customer  Type :- " +cutomerType);
System.out.println("Product Name :- " +productName);
System.out.println("Price :- " + price);
System.out.println("Discount :- " + discount);
System.out.println("Delivery Charge :- " + deliveryCharge);

System.out.println("=============================");

System.out.println("Total Amount:- " + totalAmount);

System.out.println("=============================");
System.out.println("  THANK YOU ! ! ! ");
System.out.println("=============================");










     }
	 

}