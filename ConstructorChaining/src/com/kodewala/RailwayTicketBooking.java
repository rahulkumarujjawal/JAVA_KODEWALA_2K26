package com.kodewala;

import java.util.Scanner;

class RailwayTicketBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==========================================");
		System.out.println("     🚂 IRCTC RAILWAY TICKET BOOKING 🚂");
		System.out.println("==========================================");

		// ===========================================================
		// STEP 1: Take all inputs from user
		// ===========================================================
		System.out.print("\nEnter Passenger Name       : ");
		String passengerName = sc.nextLine();

		System.out.print("Enter Age                  : ");
		int age = sc.nextInt();
		sc.nextLine(); // clear buffer

		System.out.print("Enter Gender (M/F)          : ");
		String gender = sc.nextLine();

		System.out.print("Enter Train Number          : ");
		String trainNo = sc.nextLine();

		System.out.print("Enter Source Station         : ");
		String source = sc.nextLine();

		System.out.print("Enter Destination Station    : ");
		String destination = sc.nextLine();

		System.out.print("Enter Class (SL/3A/2A/1A)    : ");
		String travelClass = sc.nextLine();

		System.out.print("Enter Quota (General/Senior) : ");
		String quota = sc.nextLine();

		/*
		 * STEP 2: main() calls bookRailwayTicket() Passes ALL collected inputs as
		 * arguments Waits for entire booking process to finish Stores final result
		 * string (success/failure message)
		 */
		String result = RailwayTicketBooking.bookRailwayTicket(passengerName, age, gender, trainNo, source, destination,
				travelClass, quota);

		// FINAL STEP: Print result returned from booking process
		System.out.println("\n📋 FINAL STATUS:");
		System.out.println(result);
		System.out.println("==========================================");

		sc.close();
	}

	// ===============================================================
	// MASTER METHOD — bookRailwayTicket()
	// ===============================================================
	// CONTROLLER of the entire booking process.
	// Calls each sub method IN ORDER.
	// Each sub method uses OPERATORS and CONDITIONS internally.
	// ===============================================================
	public static String bookRailwayTicket(String name, int age, String gender, String trainNo, String source,
			String destination, String travelClass, String quota) {

		System.out.println("\n⚙️  Booking Process Started...");
		System.out.println("------------------------------------------");

		// -----------------------------------------------------------
		// STEP 2: Validate passenger age using CONDITIONS
		// -----------------------------------------------------------
		boolean isValidAge = RailwayTicketBooking.validatePassengerAge(age);

		if (isValidAge == false) { // CONDITION
			return "❌ Booking Failed: Invalid Age Entered!";
		}

		// -----------------------------------------------------------
		// STEP 3: Check train availability on this route
		// -----------------------------------------------------------
		boolean trainAvailable = RailwayTicketBooking.checkTrainAvailability(trainNo, source, destination);

		if (trainAvailable == false) { // CONDITION
			return "❌ Booking Failed: Train Not Available" + " on this Route!";
		}

		// -----------------------------------------------------------
		// STEP 4: Calculate distance between stations
		// -----------------------------------------------------------
		int distance = RailwayTicketBooking.calculateDistance(source, destination);

		// -----------------------------------------------------------
		// STEP 5: Calculate base fare using distance (OPERATORS)
		// -----------------------------------------------------------
		double baseFare = RailwayTicketBooking.calculateBaseFare(distance);

		// -----------------------------------------------------------
		// STEP 6: Calculate class charge using CONDITIONS
		// -----------------------------------------------------------
		double classCharge = RailwayTicketBooking.calculateClassCharge(baseFare, travelClass);

		// -----------------------------------------------------------
		// STEP 7: Calculate concession using nested CONDITIONS
		// -----------------------------------------------------------
		double subtotal = baseFare + classCharge; // OPERATOR (+)

		double concession = RailwayTicketBooking.calculateConcession(age, gender, subtotal);

		// -----------------------------------------------------------
		// STEP 8: Calculate GST using OPERATORS
		// -----------------------------------------------------------
		double amountAfterConcession = subtotal - concession; // (-)

		double gst = RailwayTicketBooking.calculateGST(amountAfterConcession);

		// -----------------------------------------------------------
		// STEP 9: Calculate total fare
		// -----------------------------------------------------------
		double totalFare = RailwayTicketBooking.calculateTotalFare(amountAfterConcession, gst);

		// -----------------------------------------------------------
		// STEP 10: Check seat quota status using CONDITIONS
		// -----------------------------------------------------------
		String seatStatus = RailwayTicketBooking.checkQuotaStatus(quota, travelClass);

		// -----------------------------------------------------------
		// STEP 11: Generate PNR number using OPERATORS
		// -----------------------------------------------------------
		long pnrNumber = RailwayTicketBooking.generatePNR(age, distance);

		// -----------------------------------------------------------
		// STEP 12: Print final ticket
		// -----------------------------------------------------------
		RailwayTicketBooking.printTicket(name, age, gender, trainNo, source, destination, travelClass, distance,
				baseFare, classCharge, concession, gst, totalFare, seatStatus, pnrNumber);

		// All steps successful — return final result to main()
		return "✅ Ticket Booked Successfully! PNR: " + pnrNumber;
	}

	// ===============================================================
	// SUB METHOD 1 — validatePassengerAge()
	// ===============================================================
	// Job : Check if age is in valid range (1 to 120)
	// Returns : true (valid) / false (invalid)
	// Operators used : <, >, ||
	// ===============================================================
	public static boolean validatePassengerAge(int age) {

		System.out.println("\n🔍 Step 1 : Validating Age...");
		System.out.println("   Age Entered : " + age);

		// CONDITION using OR (||) and comparison operators (<, >)
		if (age < 1 || age > 120) {
			System.out.println("   Status      : ❌ Invalid Age!");
			return false;
		}

		// Nested IF-ELSE to classify passenger type
		if (age <= 5) {
			System.out.println("   Category    : 👶 Infant (Free Travel)");
		} else if (age > 5 && age <= 12) {
			System.out.println("   Category    : 🧒 Child");
		} else if (age > 12 && age < 60) {
			System.out.println("   Category    : 🧑 Adult");
		} else {
			System.out.println("   Category    : 👴 Senior Citizen");
		}

		System.out.println("   Status      : ✅ Age Valid!");
		return true;
	}

	// ===============================================================
	// SUB METHOD 2 — checkTrainAvailability()
	// ===============================================================
	// Job : Check if train exists for this route
	// Returns : true (available) / false (not found)
	// Operators used : equals(), &&
	// ===============================================================
	public static boolean checkTrainAvailability(String trainNo, String source, String destination) {

		System.out.println("\n🚄 Step 2 : Checking Train Availability...");
		System.out.println("   Train No  : " + trainNo);
		System.out.println("   Route     : " + source + " → " + destination);

		boolean isAvailable = false;

		// CONDITION: check valid train numbers using OR (||)
		if (trainNo.equals("12951") || trainNo.equals("12002") || trainNo.equals("22691") || trainNo.equals("12626")) {
			isAvailable = true;
		}

		// CONDITION: source and destination must be different (!=)
		if (source.equalsIgnoreCase(destination)) {
			System.out.println("   ❌ Source and Destination" + " cannot be same!");
			return false;
		}

		if (isAvailable == true) {
			System.out.println("   Status    : ✅ Train Available!");
		} else {
			System.out.println("   Status    : ❌ Train Not Found!");
		}

		return isAvailable;
	}

	// ===============================================================
	// SUB METHOD 3 — calculateDistance()
	// ===============================================================
	// Job : Calculate distance between source & destination
	// Returns : distance in KM (int)
	// Operators used : equals(), if-else chain
	// ===============================================================
	public static int calculateDistance(String source, String destination) {

		System.out.println("\n📍 Step 3 : Calculating Distance...");

		int distance = 0;

		// Using nested CONDITIONS to find distance between cities
		// (Simulated distance table)
		if (source.equalsIgnoreCase("Delhi") && destination.equalsIgnoreCase("Mumbai")) {
			distance = 1400;
		} else if (source.equalsIgnoreCase("Delhi") && destination.equalsIgnoreCase("Chennai")) {
			distance = 2180;
		} else if (source.equalsIgnoreCase("Mumbai") && destination.equalsIgnoreCase("Pune")) {
			distance = 150;
		} else if (source.equalsIgnoreCase("Bangalore") && destination.equalsIgnoreCase("Chennai")) {
			distance = 350;
		} else {
			// Default distance if route not found in our table
			distance = 500;
		}

		System.out.println("   Source      : " + source);
		System.out.println("   Destination : " + destination);
		System.out.println("   Distance    : " + distance + " km");

		return distance;
	}

	// ===============================================================
	// SUB METHOD 4 — calculateBaseFare()
	// ===============================================================
	// Job : Calculate base fare using distance
	// Returns : base fare (double)
	// Formula : distance * rate per km
	// Operators used : *, /
	// ===============================================================
	public static double calculateBaseFare(int distance) {

		System.out.println("\n💰 Step 4 : Calculating Base Fare...");

		double ratePerKm = 1.5; // OPERATOR setup
		double baseFare = distance * ratePerKm; // OPERATOR (*)

		System.out.println("   Distance    : " + distance + " km");
		System.out.println("   Rate/KM     : ₹" + ratePerKm);
		System.out.println("   Formula     : " + distance + " × " + ratePerKm);
		System.out.println("   Base Fare   : ₹" + baseFare);

		return baseFare;
	}

	// ===============================================================
	// SUB METHOD 5 — calculateClassCharge()
	// ===============================================================
	// Job : Add extra charge based on travel class
	// Returns : class charge (double)
	// Operators used : if-else, *
	// ===============================================================
	public static double calculateClassCharge(double baseFare, String travelClass) {

		System.out.println("\n🎫 Step 5 : Calculating Class Charge...");
		System.out.println("   Class       : " + travelClass);

		double multiplier = 0;

		// CONDITIONS using if-else chain to set multiplier
		if (travelClass.equalsIgnoreCase("SL")) {
			multiplier = 0.5; // Sleeper - cheapest
		} else if (travelClass.equalsIgnoreCase("3A")) {
			multiplier = 1.5; // AC 3 Tier
		} else if (travelClass.equalsIgnoreCase("2A")) {
			multiplier = 2.5; // AC 2 Tier
		} else if (travelClass.equalsIgnoreCase("1A")) {
			multiplier = 4.0; // AC First Class
		} else {
			multiplier = 0.5; // default = Sleeper
		}

		double classCharge = baseFare * multiplier; // OPERATOR (*)

		System.out.println("   Multiplier  : " + multiplier + "x");
		System.out.println("   Class Charge: ₹" + classCharge);

		return classCharge;
	}

	// ===============================================================
	// SUB METHOD 6 — calculateConcession()
	// ===============================================================
	// Job : Calculate discount for senior citizens/children
	// Returns : concession amount (double)
	// Operators used : nested if, &&, *
	// ===============================================================
	public static double calculateConcession(int age, String gender, double subtotal) {

		System.out.println("\n🏷️  Step 6 : Calculating Concession...");

		double concessionPercent = 0;

		// NESTED IF with AND (&&) operator
		if (age >= 60 && gender.equalsIgnoreCase("M")) {
			concessionPercent = 40; // 40% off for senior male
			System.out.println("   Type        : Senior Citizen Male");

		} else if (age >= 58 && gender.equalsIgnoreCase("F")) {
			concessionPercent = 50; // 50% off for senior female
			System.out.println("   Type        : Senior Citizen Female");

		} else if (age > 5 && age <= 12) {
			concessionPercent = 25; // 25% off for children
			System.out.println("   Type        : Child Discount");

		} else if (age <= 5) {
			concessionPercent = 100; // Free for infants
			System.out.println("   Type        : Infant (Free)");

		} else {
			concessionPercent = 0; // No discount for regular adults
			System.out.println("   Type        : Regular Adult" + " (No Discount)");
		}

		// Formula: concession = subtotal * percent / 100
		double concession = (subtotal * concessionPercent) / 100; // (*,/)

		System.out.println("   Concession %: " + concessionPercent + "%");
		System.out.println("   Concession ₹: ₹" + concession);

		return concession;
	}

	// ===============================================================
	// SUB METHOD 7 — calculateGST()
	// ===============================================================
	// Job : Calculate 5% GST on fare
	// Returns : GST amount (double)
	// Operators used : *, /
	// ===============================================================
	public static double calculateGST(double amount) {

		System.out.println("\n🏛️  Step 7 : Calculating GST...");

		double gstRate = 5.0; // 5% GST
		double gst = (amount * gstRate) / 100; // OPERATOR (*, /)

		System.out.println("   Amount      : ₹" + amount);
		System.out.println("   GST Rate    : " + gstRate + "%");
		System.out.println("   GST Amount  : ₹" + gst);

		return gst;
	}

	// ===============================================================
	// SUB METHOD 8 — calculateTotalFare()
	// ===============================================================
	// Job : Add amount + GST to get final total
	// Returns : total fare (double)
	// Operators used : +
	// ===============================================================
	public static double calculateTotalFare(double amount, double gst) {

		System.out.println("\n🧮 Step 8 : Calculating Total Fare...");

		double total = amount + gst; // OPERATOR (+)

		System.out.println("   Amount      : ₹" + amount);
		System.out.println("   GST         : ₹" + gst);
		System.out.println("   TOTAL FARE  : ₹" + total);

		return total;
	}

	// ===============================================================
	// SUB METHOD 9 — checkQuotaStatus()
	// ===============================================================
	// Job : Determine seat status (Confirmed/RAC/Waitlist)
	// Returns : status string
	// Operators used : %, if-else, ==
	// ===============================================================
	public static String checkQuotaStatus(String quota, String travelClass) {

		System.out.println("\n💺 Step 9 : Checking Quota Status...");
		System.out.println("   Quota       : " + quota);
		System.out.println("   Class       : " + travelClass);

		// Simulate available seats using modulus operator (%)
		int seedNumber = quota.length() + travelClass.length();
		int availableSeats = (seedNumber * 7) % 50; // OPERATOR (%, *)

		String status = "";

		// CONDITIONS to decide booking status
		if (availableSeats > 10) {
			status = "✅ CONFIRMED (CNF)";
		} else if (availableSeats > 0 && availableSeats <= 10) {
			status = "🟡 RAC (Reservation Against Cancellation)";
		} else {
			status = "🔴 WAITLISTED (WL)";
		}

		System.out.println("   Available   : " + availableSeats + " seats");
		System.out.println("   Status      : " + status);

		return status;
	}

	// ===============================================================
	// SUB METHOD 10 — generatePNR()
	// ===============================================================
	// Job : Generate a unique 10-digit PNR number
	// Returns : PNR number (long)
	// Operators used : +, *, %
	// ===============================================================
	public static long generatePNR(int age, int distance) {

		System.out.println("\n🎟️  Step 10 : Generating PNR...");

		// Using OPERATORS to create a pseudo-unique PNR
		long base = 4000000000L; // base PNR
		long part1 = (long) (age * 12345); // (*)
		long part2 = (long) (distance * 67); // (*)
		long pnr = base + part1 + part2; // (+)
		pnr = pnr % 9999999999L; // (%)

		System.out.println("   PNR Number  : " + pnr);

		return pnr;
	}

	// ===============================================================
	// SUB METHOD 11 — printTicket()
	// ===============================================================
	// Job : Print the final formatted ticket
	// Returns : nothing (void)
	// ===============================================================
	public static void printTicket(String name, int age, String gender, String trainNo, String source,
			String destination, String travelClass, int distance, double baseFare, double classCharge,
			double concession, double gst, double totalFare, String seatStatus, long pnr) {

		System.out.println("\n==========================================");
		System.out.println("         🎫 E-TICKET (IRCTC)              ");
		System.out.println("==========================================");
		System.out.println("  PNR No        : " + pnr);
		System.out.println("  Passenger     : " + name + " (" + age + " / " + gender + ")");
		System.out.println("  Train No      : " + trainNo);
		System.out.println("  Route         : " + source + " → " + destination);
		System.out.println("  Distance      : " + distance + " km");
		System.out.println("  Class         : " + travelClass);
		System.out.println("------------------------------------------");
		System.out.printf("  Base Fare     : ₹%.2f%n", baseFare);
		System.out.printf("  Class Charge  : ₹%.2f%n", classCharge);
		System.out.printf("  Concession    : -₹%.2f%n", concession);
		System.out.printf("  GST (5%%)      : ₹%.2f%n", gst);
		System.out.println("------------------------------------------");
		System.out.printf("  TOTAL FARE    : ₹%.2f%n", totalFare);
		System.out.println("  Seat Status   : " + seatStatus);
		System.out.println("==========================================");
		System.out.println("  🎉 Have a Safe Journey!");
		System.out.println("==========================================");
	}
}
