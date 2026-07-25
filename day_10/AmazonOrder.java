class AmazonOrder
{
    public static void main(String args[])
    {
        System.out.println("This is Order class");

        String result = Order.placeOrder("Apple17 Pro", "Apple", 1);

        System.out.println("Result is : " + result);

        System.out.println("____________________________________");
    }

    public static String placeOrder(String itemName,
                                    String brandName,
                                    int quantity)
    {
        System.out.println("Place order for an item :- " + itemName);

        int amount = Order.getPrice(quantity);

        String orderId = Order.generateOrderId();

        return "Order Placed Successfully | Order Id : "
                + orderId
                + " | Amount : "
                + amount;
    }

    public static int getPrice(int quantity)
    {
        System.out.println("Calculating price");

        return quantity * 80000;
    }

    public static String generateOrderId()
    {
        System.out.println("Generating Order Id");

        return "APPLEX2345";
    }
}