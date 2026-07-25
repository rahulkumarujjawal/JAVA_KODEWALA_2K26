class UberRideBooking
   {
      public static void main(String args[]) {

        System.out.println("====================================");
        System.out.println("      UBER RIDE BOOKING SYSTEM");
        System.out.println("====================================");

        long rideId = 10001L;

        String customerName = "Rahul Ujjawal Sharma";
        long customerMobileNumber = 8883828282L;

        String pickupLocation = "Boomanhalli Metro Station";
        String dropLocation = " Kodewala Academy";

        double distanceInKm = 4.5;
        double farePerKm = 8.5;

        double rideFare = distanceInKm * farePerKm;

        double gst = 22.50;

        // Total Fare Before Discount
        double totalFare = rideFare + gst;

        // 20% Discount
        double discount = totalFare * 10 / 100;

        // Final Fare After Discount
        double finalFare = totalFare - discount;

        String cabType = "Uber Go";
        String driverName = "Ramesh Kumar";
        long driverMobileNumber = 9876543210L;

        String vehicleNumber = "KA01AB1234";
        String rideStatus = "Driver Arriving";

        boolean paymentCompleted = true;

        System.out.println("Ride Id              :- " + rideId);
        System.out.println("Customer Name        :- " + customerName);
        System.out.println("Customer Mobile      :- " + customerMobileNumber);

        System.out.println("------------------------------------");

        System.out.println("Pickup Location      :- " + pickupLocation);
        System.out.println("Drop Location        :- " + dropLocation);
        System.out.println("Distance (KM)        :- " + distanceInKm);

        System.out.println("------------------------------------");

        System.out.println("Cab Type             :- " + cabType);
        System.out.println("Driver Name          :- " + driverName);
        System.out.println("Driver Mobile        :- " + driverMobileNumber);
        System.out.println("Vehicle Number       :- " + vehicleNumber);

        System.out.println("------------------------------------");

        System.out.println("Ride Fare            :- " + rideFare);
        System.out.println("GST Amount           :- " + gst);
        System.out.println("Total Fare           :- " + totalFare);
        System.out.println("20% Discount         :- " + discount);
        System.out.println("Final Fare           :- " + finalFare);

        System.out.println("------------------------------------");

        System.out.println("Ride Status          :- " + rideStatus);
        System.out.println("Payment Completed    :- " + paymentCompleted);

        System.out.println("====================================");
        System.out.println("         THANK YOU !!!");
        System.out.println("====================================");

    }
}