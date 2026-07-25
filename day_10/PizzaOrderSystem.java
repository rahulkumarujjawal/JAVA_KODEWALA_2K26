public class PizzaOrderSystem
{
    // METHOD 1 — Calculate base price
    public static double getBasePrice(String size)
    {
        if (size.equals("Small"))
            return 8.0;

        if (size.equals("Medium"))
            return 12.0;

        if (size.equals("Large"))
            return 16.0;

        return 0;
    }

    // METHOD 2 — Calculate topping cost
    public static double getToppingCost(int toppingCount)
    {
        return toppingCount * 1.5;
    }

    // METHOD 3 — Calculate tax
    public static double calculateTax(double amount)
    {
        return amount * 0.10;
    }

    // METHOD 4 — Calculate delivery charge
    public static double getDeliveryCharge(String orderType)
    {
        if (orderType.equals("Delivery"))
        {
            return 3.0;
        }

        return 0;
    }

    // METHOD 5 — Place Order
    public static void placeOrder(String size,
                                  int toppings,
                                  String orderType,
                                  String customerName)
    {
        System.out.println("=================================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Pizza Size    : " + size);

        // Calling Method 1
        double basePrice = PizzaOrderSystem.getBasePrice(size);
        System.out.println("Base Price    : $" + basePrice);

        // Calling Method 2
        double toppingCost = PizzaOrderSystem.getToppingCost(toppings);
        System.out.println("Topping Cost  : $" + toppingCost);

        double subTotal = basePrice + toppingCost;
        System.out.println("Sub Total     : $" + subTotal);

        // Calling Method 3
        double tax = PizzaOrderSystem.calculateTax(subTotal);
        System.out.println("Tax           : $" + tax);

        // Calling Method 4
        double deliveryCharge =
                PizzaOrderSystem.getDeliveryCharge(orderType);

        System.out.println("Delivery Fee  : $" + deliveryCharge);

        double grandTotal =
                subTotal + tax + deliveryCharge;

        System.out.println("Grand Total   : $" + grandTotal);

        System.out.println("Order Type    : " + orderType);
        System.out.println("Order Placed Successfully");
        System.out.println("=================================");
    }

    // MAIN METHOD
    public static void main(String[] args)
    {
        System.out.println("Pizza Order System Started");

PizzaOrderSystem.placeOrder(
                "Large",
                3,
                "Delivery",
                "Rahul Ujjawal");

        System.out.println("--------------------------------");

        PizzaOrderSystem.placeOrder(
                "Medium",
                2,
                "Pickup",
                "Ujjawal Sharma");

        System.out.println("Pizza Order System Ended");
    }
}