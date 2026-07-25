class ECommerceOrder

{
public static void main(String args[]){
System.out.println("Order START ! ! ! ");

ECommerceOrder.placeAndOrder("macbook air laptop");

System.out.println("placeOrder END ! ! ! ! ");
}

public static boolean placeAndOrder(String itemName)

{
System.out.println("Order Place START");
boolean paymentStatus = ECommerceOrder.payForItem(itemName);
boolean invoiceStatus = ECommerceOrder.generateInvoice(itemName);
boolean emailStatus = ECommerceOrder.sendOrderUpdateEmail(itemName);
System.out.println("Order Placement END");
return true;

 }



public static boolean generateInvoice(String itemName)
{
System.out.println("Generating invoice  :- " + itemName);
return true;

}
	
	

public static boolean sendOrderUpdateEmail(String itemName)
{
System.out.println("Sending order update email :- " + itemName);
return true;
}
	
	
	
public static boolean payForItem(String itemName)
 {
System.out.println("Processing payment :- " + itemName);
return true;

}
	
	}