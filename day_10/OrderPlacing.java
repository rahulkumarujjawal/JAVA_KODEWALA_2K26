class OrderPlacing
{
     public static void main(String[] args)

{
        System.out.println("_______________________________________________");

        int placeOrderStatus = OrderPlacing.placeOrder("Biryani", "Near by silk board ");
        System.out.println("Order placed ! ! !");

        boolean receiveEmail = OrderPlacing.orderEmail("Near by silk board", "Biryani");
        System.out.println("Email received ! !");

        int totalAmount = OrderPlacing.orderInvoice("Biryani");
        System.out.println("Total Amount : " + totalAmount);

        boolean paymentStatus = OrderPlacing.payAmount("Biryani");
        System.out.println("Delivery done");
		
		System.out.println("_______________________________________________");

    }

public static int placeOrder(String itemName, String customerName)
    {
        int receiveInvoiceAmount = OrderPlacing.orderInvoice(itemName);
        return receiveInvoiceAmount;
    }

public static boolean orderEmail(String customerName, String itemName)
    {
        String message = "Order placing successfull ";
        System.out.println("Customer Name :- " + customerName);
        System.out.println("Item Name :- " + itemName);
        System.out.println(message);
        return true;
    }
	
public static int orderInvoice(String itemName)
{
        return 2500;
 }

 public static boolean payAmount(String itemName)
    {
        System.out.println("Payment has been successful :- " + itemName);
        return true;
	
	
    }
}