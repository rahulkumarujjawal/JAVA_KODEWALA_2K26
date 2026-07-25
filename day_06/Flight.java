class FlightBookingSystem {

    public static void main(String args[]) {

        System.out.println("====================================");
        System.out.println("      FLIGHT BOOKING SYSTEM");
        System.out.println("====================================");

        long ticketId = 10001L;

        String passengerName = "Rahul Ujjawal Sharma";
        String airlineName = "IndiGo";

        String source = "Bangalore";
        String destination = "Delhi";

        double ticketFare = 6500.00;
        double baggageCharge = 500.00;
        double gst = 1170.00;

        double totalFare = ticketFare + baggageCharge + gst;

        boolean webCheckIn = true;

        System.out.println("Ticket Id           :- " + ticketId);
        System.out.println("Passenger Name      :- " + passengerName);
        System.out.println("Airline Name        :- " + airlineName);

        System.out.println("------------------------------------");

        System.out.println("Source              :- " + source);
        System.out.println("Destination         :- " + destination);

        System.out.println("------------------------------------");

        System.out.println("Ticket Fare         :- " + ticketFare);
        System.out.println("Baggage Charge      :- " + baggageCharge);
        System.out.println("GST Amount          :- " + gst);
        System.out.println("Total Fare          :- " + totalFare);

        System.out.println("------------------------------------");

        System.out.println("Web Check-In        :- " + webCheckIn);

        System.out.println("====================================");
        System.out.println("     HAPPY JOURNEY !!!");
        System.out.println("====================================");

    }
}