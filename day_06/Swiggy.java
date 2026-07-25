class SwiggyOrderSystem {

    public static void main(String args[]) {

        System.out.println("====================================");
        System.out.println("       SWIGGY ORDER SYSTEM");
        System.out.println("====================================");

        long orderId = 20001L;

        String customerName = "Rahul Ujjawal ";
        long customerMobileNumber = 8709943433L;

        String restaurantName = "Biryani House";
        String foodItem = "Chicken Biryani Family Pack";

        double foodPrice = 499.00;
        double packingCharge = 20.00;
        double deliveryFee = 40.00;
        double gst = 25.00;

        // Total Before Discount
        double totalAmount = foodPrice + packingCharge + deliveryFee + gst;

        // 20% Discount
        double discount = totalAmount * 20 / 100;

        // Final Amount
        double finalAmount = totalAmount - discount;

        String pickupAddress = "Biryani House, HSR Layout";
        String deliveryAddress = "Electronic City, Bangalore";

        String deliveryPartner = "Ramesh Kumar";
        long deliveryPartnerMobile = 9876543210L;

        String orderStatus = "Out For Delivery";

        boolean contactlessDelivery = true;
        boolean paymentCompleted = true;

        System.out.println("Order Id              :- " + orderId);
        System.out.println("Customer Name         :- " + customerName);
        System.out.println("Customer Mobile       :- " + customerMobileNumber);

        System.out.println("------------------------------------");

        System.out.println("Restaurant Name       :- " + restaurantName);
        System.out.println("Food Item             :- " + foodItem);

        System.out.println("------------------------------------");

        System.out.println("Food Price            :- " + foodPrice);
        System.out.println("Packing Charge        :- " + packingCharge);
        System.out.println("Delivery Fee          :- " + deliveryFee);
        System.out.println("GST Amount            :- " + gst);

        System.out.println("------------------------------------");

        System.out.println("Total Amount          :- " + totalAmount);
        System.out.println("20% Discount          :- " + discount);
        System.out.println("Final Amount          :- " + finalAmount);

        System.out.println("------------------------------------");

        System.out.println("Pickup Address        :- " + pickupAddress);
        System.out.println("Delivery Address      :- " + deliveryAddress);

        System.out.println("------------------------------------");

        System.out.println("Delivery Partner      :- " + deliveryPartner);
        System.out.println("Partner Mobile        :- " + deliveryPartnerMobile);

        System.out.println("------------------------------------");

        System.out.println("Order Status          :- " + orderStatus);
        System.out.println("Contactless Delivery  :- " + contactlessDelivery);
        System.out.println("Payment Completed     :- " + paymentCompleted);

        System.out.println("====================================");
        System.out.println("       ENJOY YOUR FOOD !!!");
        System.out.println("====================================");
    }
}