class IRCTCBookingSystem {

    public static void main(String[] args) {

        System.out.println("🚂 ======== IRCTC BOOKING SYSTEM ========");

        /*
main()
   |
   v
bookTrainTicket()
   |
   +--> checkTrainAvailability()
   |
   +--> checkQuota()
   |
   +--> calculateTicketFare()
   |
   +--> processIRCTCPayment()
   |
   +--> generatePNR()
   |
   v
return "PNR : 4521367890 | Seat : S4-32 | Status : CONFIRMED"
   |
   v
main()
   |
   v
System.out.println(result)
         * STEP 1 : main() calls bookTrainTicket()
         * All journey details passed as arguments
         * main() WAITS until full booking is done
         * Final PNR stored in "result"
         */
        String result = IRCTCBookingSystem.bookTrainTicket(
                            "Vikram Singh",       // passenger name
                            "12951",              // train number
                            "NDLS",               // from station
                            "MMCT",               // to station
                            "3A",                 // class (3 tier AC)
                            "25-12-2024",         // journey date
                            "vikram@gmail.com",   // email
                            1);                   // passengers

        /*
         * STEP 7 : main() gets final PNR result
         * Prints the complete booking confirmation
         */
        System.out.println("\n📋 BOOKING CONFIRMATION:");
        System.out.println(result);
        System.out.println("=========================================");
    }

    /*
     * MASTER METHOD — bookTrainTicket()
     * ------------------------------------
     * The CONDUCTOR of entire booking process
     * Calls 5 sub methods in order
     * Returns PNR confirmation to main()
     */
    public static String bookTrainTicket(String passengerName,
                                          String trainNo,
                                          String fromStation,
                                          String toStation,
                                          String travelClass,
                                          String journeyDate,
                                          String email,
                                          int passengers) {

        System.out.println("\n🎫 IRCTC Booking Started...");
        System.out.println("   Passenger  : " + passengerName);
        System.out.println("   Train No   : " + trainNo);
        System.out.println("   Route      : " + fromStation
                         + " → " + toStation);
        System.out.println("   Class      : " + travelClass);
        System.out.println("   Date       : " + journeyDate);

        /*
         * STEP 2 : bookTrainTicket() calls checkTrainAvailability()
         * Checks if train runs on that date and route
         * Gets back train name or "NOT FOUND"
         */
        String trainName = IRCTCBookingSystem
                              .checkTrainAvailability(
                                  trainNo, fromStation, toStation);

        if (trainName.equals("NOT FOUND")) {
            return "❌ Booking Failed : Train Not Available "
                 + "on this route!";
        }

        /*
         * STEP 3 : bookTrainTicket() calls checkQuota()
         * Checks available seats in the quota
         * Gets back seat count OR 0 (waitlist)
         */
        int availableSeats = IRCTCBookingSystem
                                .checkQuota(trainNo,
                                             travelClass,
                                             journeyDate);

        String seatStatus = availableSeats > 0
                            ? "AVAILABLE" : "WAITLIST";

        /*
         * STEP 4 : bookTrainTicket() calls calculateTicketFare()
         * Calculates total fare for journey
         * Gets back total amount to pay
         */
        double fare = IRCTCBookingSystem
                         .calculateTicketFare(
                             travelClass, passengers,
                             fromStation, toStation);

        /*
         * STEP 5 : bookTrainTicket() calls processIRCTCPayment()
         * Processes payment via UPI/Card
         * Gets back transaction ID or "FAILED"
         */
        String txnId = IRCTCBookingSystem
                          .processIRCTCPayment(
                              passengerName, fare, email);

        if (txnId.equals("FAILED")) {
            return "❌ Booking Failed : Payment Unsuccessful!";
        }

        /*
         * STEP 6 : bookTrainTicket() calls generatePNR()
         * Generates PNR and seat allotment
         * Gets back PNR + seat number
         */
        String pnrDetails = IRCTCBookingSystem
                               .generatePNR(
                                   passengerName, trainNo,
                                   fromStation, toStation,
                                   travelClass, txnId,
                                   seatStatus);

        return "✅ Booking Confirmed!"
             + "\n   Passenger  : " + passengerName
             + "\n   Train      : " + trainNo
                                    + " - " + trainName
             + "\n   Route      : " + fromStation
                                    + " → " + toStation
             + "\n   Date       : " + journeyDate
             + "\n   Class      : " + travelClass
             + "\n   Fare Paid  : ₹" + fare
             + "\n   Txn ID     : " + txnId
             + "\n   " + pnrDetails;
    }

    /*
     * SUB METHOD 1 — checkTrainAvailability()
     * ------------------------------------------
     * Job     : Check if train exists on this route
     * Input   : train number, from, to stations
     * Returns : Train name OR "NOT FOUND"
     * Back to : bookTrainTicket()
     */
    public static String checkTrainAvailability(String trainNo,
                                                 String from,
                                                 String to) {
        System.out.println("\n🚄 Step 1 : Checking Train Availability...");
        System.out.println("   Train No  : " + trainNo);
        System.out.println("   Route     : " + from + " → " + to);

        // Simulate train database lookup
        String trainName = "NOT FOUND";
        if (trainNo.equals("12951")) trainName = "Mumbai Rajdhani";
        if (trainNo.equals("12002")) trainName = "Bhopal Shatabdi";
        if (trainNo.equals("22691")) trainName = "Rajdhani Express";

        System.out.println("   Train Name: " + trainName);
        System.out.println("   Status    : "
               + (trainName.equals("NOT FOUND")
                  ? "❌ Train Not Found!"
                  : "✅ Train Available!"));

        return trainName;
    }

    /*
     * SUB METHOD 2 — checkQuota()
     * ----------------------------
     * Job     : Check seat quota availability
     * Input   : train number, class, date
     * Returns : number of available seats
     * Back to : bookTrainTicket()
     */
    public static int checkQuota(String trainNo,
                                  String travelClass,
                                  String date) {
        System.out.println("\n💺 Step 2 : Checking Seat Quota...");
        System.out.println("   Train No  : " + trainNo);
        System.out.println("   Class     : " + travelClass);
        System.out.println("   Date      : " + date);

        // Simulate quota check
        int availableSeats = 18;

        System.out.println("   Available : " + availableSeats
                         + " seats");
        System.out.println("   Status    : "
               + (availableSeats > 0
                  ? "✅ Seats Available (GNWL)"
                  : "⚠️  Waitlist Only"));

        return availableSeats;
    }

    /*
     * SUB METHOD 3 — calculateTicketFare()
     * ----------------------------------------
     * Job     : Calculate total ticket fare
     * Input   : class, passenger count, route
     * Returns : total fare amount (double)
     * Back to : bookTrainTicket()
     */
    public static double calculateTicketFare(String travelClass,
                                              int passengers,
                                              String from,
                                              String to) {
        System.out.println("\n💰 Step 3 : Calculating Ticket Fare...");
        System.out.println("   Class     : " + travelClass);
        System.out.println("   Route     : " + from + " → " + to);

        // Fare per person by class
        double baseFare = 0;
        if (travelClass.equals("1A"))  baseFare = 4500; // 1st AC
        if (travelClass.equals("2A"))  baseFare = 2800; // 2nd AC
        if (travelClass.equals("3A"))  baseFare = 1950; // 3rd AC
        if (travelClass.equals("SL"))  baseFare = 650;  // Sleeper
        if (travelClass.equals("CC"))  baseFare = 1200; // Chair Car

        double reservation  = 40;    // Reservation charge
        double superFast    = 75;    // Superfast surcharge
        double gst          = baseFare * 0.05; // 5% GST
        double serviceCharge = 20;   // IRCTC service charge

        double totalPerPerson = baseFare + reservation
                              + superFast + gst + serviceCharge;
        double grandTotal     = totalPerPerson * passengers;

        System.out.println("   Base Fare : ₹" + baseFare);
        System.out.println("   GST(5%%)  : ₹" + gst);
        System.out.println("   Surcharge : ₹" + (reservation
                                                + superFast));
        System.out.println("   IRCTC Fee : ₹" + serviceCharge);
        System.out.printf ("   Total     : ₹%.2f%n", grandTotal);
        System.out.println("   Status    : ✅ Fare Calculated!");

        return grandTotal;
    }

    /*
     * SUB METHOD 4 — processIRCTCPayment()
     * ----------------------------------------
     * Job     : Process UPI/Card payment
     * Input   : passenger name, fare, email
     * Returns : transaction ID OR "FAILED"
     * Back to : bookTrainTicket()
     */
    public static String processIRCTCPayment(String name,
                                              double fare,
                                              String email) {
        System.out.println("\n💳 Step 4 : Processing IRCTC Payment...");
        System.out.println("   Name      : " + name);
        System.out.println("   Amount    : ₹" + fare);
        System.out.println("   Email     : " + email);
        System.out.println("   Method    : UPI Payment");

        // Generate transaction ID
        String txnId = "IRCTC" + (100000
                     + (int)(Math.random() * 900000));

        System.out.println("   Txn ID    : " + txnId);
        System.out.println("   Status    : ✅ Payment Successful!");
        System.out.println("   📧 Receipt sent to " + email);

        return txnId;
    }

    /*
     * SUB METHOD 5 — generatePNR()
     * --------------------------------
     * Job     : Generate PNR and allot seat
     * Input   : booking details + transaction ID
     * Returns : PNR + seat allotment String
     * Back to : bookTrainTicket()
     */
    public static String generatePNR(String name,
                                      String trainNo,
                                      String from, String to,
                                      String travelClass,
                                      String txnId,
                                      String seatStatus) {
        System.out.println("\n🎟️  Step 5 : Generating PNR...");
        System.out.println("   Passenger : " + name);
        System.out.println("   Train     : " + trainNo);
        System.out.println("   Route     : " + from + " → " + to);
        System.out.println("   Txn ID    : " + txnId);

        // Generate PNR number (10 digits)
        long pnrNo   = 4000000000L
                     + (long)(Math.random() * 999999999);
        String coach = travelClass + "-" + (1 + (int)(Math.random() * 10));
        int    seat  = 1 + (int)(Math.random() * 72);

        String pnrDetails = "PNR No    : " + pnrNo
                + "\n   Coach     : " + coach
                + "\n   Seat No   : " + seat
                + "\n   Status    : " + seatStatus;

        System.out.println("   PNR No    : " + pnrNo);
        System.out.println("   Coach     : " + coach);
        System.out.println("   Seat No   : " + seat);
        System.out.println("   Status    : ✅ PNR Generated!");
        System.out.println("   📱 SMS sent to registered mobile!");

        return pnrDetails;
    }
}