class ZeptoOrderCheck {

    public static void main(String args[]) {

        double orderValue = Double.parseDouble(args[0]);

        System.out.println("--------------------------------");
        System.out.println("WELCOME TO ZEPTO");
        System.out.println("--------------------------------");

        System.out.println("Order Value :- " + orderValue);

        System.out.println("Eligible For Free Delivery :- "
                            + (orderValue >= 450));

        System.out.println("--------------------------------");
    }
}