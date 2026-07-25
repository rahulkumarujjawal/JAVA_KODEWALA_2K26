class EcommerceApp{

    public static boolean placeOrder(int orderId){
        System.out.println("placing order!...");
        payment(orderId);
        generateInvoice(orderId);
        sendNotificationMail(orderId);

        System.out.println("Order placed Successfully!...");

        return true;
    }

    public static boolean generateInvoice(int orderId){
        System.out.println("Invoice generated!");

        return true;
    }

    public static boolean sendNotificationMail(int orderId){
        System.out.println("Order Details sent via mail!");

        return true;
    }

    public static boolean payment(int orderId){
        System.out.println("Payment done for this order!");

        return true;
    }

    public static void main(String args[]){
        System.out.println("Main start");

        placeOrder(12345); //order with orderId

        System.out.println("Main End");
    }
}