//Develop an application for placing an ecommerce for a given item 
// order (Main Task)

class ECommerceApllication
{
    public static void main(String args[])
    {
        boolean order = ECommerceApllication.placeOrder(2000 , 2000 , "abc123@gmail.com");
    }
    public static boolean placeOrder(int itemPrice , int price, String email)
    {
        int invoice = ECommerceApllication.getInvoice(price);
        String mail = ECommerceApllication.updateEmail(email);
        int pay = ECommerceApllication.payForItem(itemPrice);
        return true;
    }

    public static int getInvoice(int itemPriceInvoice)
    {
        System.out.println("User Receive a Invoice !!" + itemPriceInvoice);
        return 2222;
    }

    public static String updateEmail(String email)
    {
        System.out.println("User Mail id is "+ email );
        return "hhh";
    }
    public static int payForItem(int itemPrice)
    {
        System.out.println("User pay for this order !!" + itemPrice);
        return 1000;
    }
}