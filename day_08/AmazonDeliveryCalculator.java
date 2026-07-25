class AmazonDeliveryCalculator
{

public static void main(String args[]){

String  itemName = args[0];
double price = Double.parseDouble(args[1]);
String cutomerName = args[2];
String cutomerType = args[3];

double discount = 0;
double deliveryCharge = 30;
double totalPrice = 0;

if (cutomerType.equals("Premium") && price >=5000){
discount = price *10/100;
deliveryCharge = 0;

} else{

if(cutomerName.equals("Premium") || price >=1000){
deliveryCharge = 0;

} else{
deliveryCharge = 30;

}
  }

totalPrice = price -discount +deliveryCharge;

System.out.println("--------------------------------");
System.out.println("       CUSTOMER DETAILS");
System.out.println("--------------------------------");


System.out.println("Cutomer Name :- " +cutomerName);
System.out.println("Cutomer Type :- " + cutomerType);
System.out.println("Item Name :- " +itemName);
System.out.println("Item Price :- " + price);

System.out.println("--------------------------------");

System.out.println("Discount :- " + discount);
System.out.println("Delivery Charge :- " +  deliveryCharge);
System.out.println("--------------------------------");

System.out.println("Total Price :-"  + totalPrice);
System.out.println("==========================");
System.out.println("     THANK YOU !!!             ");
System.out.println("==========================");

}

}