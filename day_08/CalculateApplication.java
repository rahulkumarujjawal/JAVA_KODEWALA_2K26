class CalculateApplication {

    public static void main(String args[]) {

        String itemName      = args[0];
        double price         = Double.parseDouble(args[1]);
        String customerName  = args[2];
        String customerType  = args[3];

        double discount       = 0;
        double deliveryCharge = 30;
        double totalPrice     = 0;


        if (customerType.equals("Premium") && price >= 5000) {
            discount  = price * 10 / 100;   //  -- 10% discount
            deliveryCharge = 0;                   //  -- free delivery

        } else if (customerType.equals("Premium") && price >= 1000) {
            discount       = 0;                   //--     no discount
            deliveryCharge = 0;                   // --- free delivery

        } else {
            discount       = 0;                   // -- no discount
            deliveryCharge = 30;                  // --  flat delivery charge
        }

        totalPrice = (price - discount) + deliveryCharge;

       
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Customer Type   : " + customerType);
        System.out.println("Item Name       : " + itemName);
        System.out.println("Item Price      : Rs." + price);

		System.out.println("Cart Value      : Rs." + price);
        System.out.println("Discount        : Rs." + discount);
        System.out.println("Delivery Charge : Rs." + deliveryCharge);
		
        System.out.println("----------------------------------------");
        System.out.println("Total Price :- Rs." + totalPrice);
        System.out.println("========================================");
    }
}