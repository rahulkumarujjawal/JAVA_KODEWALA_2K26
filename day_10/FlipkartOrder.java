class FlipkartOrder{

    public static void main(String args[]) {

        String productName = args[0];
        String brandName = args[1];
        int quantity = Integer.parseInt(args[2]);
        int pricePerItem = Integer.parseInt(args[3]);
        String customerName = args[4];
        String email = args[5];
        String deliveryAddress = args[6];
        long mobileNumber = Long.parseLong(args[7]);
		

        String result = FlipkartOrder.placeOrder(productName,brandName,quantity,pricePerItem,customerName,email,deliveryAddress,mobileNumber);
        System.out.println(result);
		
    }

    public static String placeOrder(String productName,String brandName,int quantity,int pricePerItem,String customerName,String email,String address,long mobileNumber) 
	{

        int totalAmount                  =   FlipkartOrder.calculateAmount(quantity, pricePerItem);
        String orderId                     =   FlipkartOrder.generateOrderId(productName);
        String invoice                     =   FlipkartOrder.generateInvoice(orderId, totalAmount);
        String emailStatus              =    FlipkartOrder.sendEmail(customerName, email, orderId);
		String deliveryStatus          =     FlipkartOrder.scheduleDelivery(address);
        return
		
                "\n==================================" +
                "\nCustomer Name :- " + customerName +
                "\nMobile Number :- " + mobileNumber +
                "\nProduct Name :- " + productName +
                "\nBrand Name :- " + brandName +
                "\nQuantity :- " + quantity +
                "\nPrice/Item :- " + pricePerItem +
                "\nTotal Amount :- " + totalAmount +
                "\nOrder Id :- " + orderId +
                "\n" + invoice +
                "\n" + emailStatus +
                "\n" + deliveryStatus +
                "\n==================================";
    }

    public static int calculateAmount(int quantity, int pricePerItem) {

        return quantity * pricePerItem;
    }
	

    public static String generateOrderId(String productName) {

        return "ORD19999";
    }


    public static String generateInvoice(String orderId, int amount) {

        return "Invoice Generated | Order Id :- "
                + orderId
                + " | Amount :- "
                + amount;
    }

    public static String sendEmail(String customerName, String email,String orderId) {
		return "Email Sent To :- "
                + customerName
                + " ("
                + email
                + ") For Order :- "
                + orderId;
    }

    public static String scheduleDelivery(String address) {

        return "Delivery Scheduled At :- "
                + address;
				
    }
	
}