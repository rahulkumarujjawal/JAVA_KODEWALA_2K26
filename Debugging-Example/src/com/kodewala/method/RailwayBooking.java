package com.kodewala.method;
  
public class RailwayBooking {
	public static void main(String[] args) {
		String passengerName = args[0];
		int ticketCount = Integer.parseInt(args[1]);
		int ticketPrice = Integer.parseInt(args[2]);

		greetPassenger(passengerName);
		int totalAmount = calculateAmount(ticketCount, ticketPrice);
		int discount = calculateDiscount(totalAmount);
		int finalAmount = calculateFinalAmount(totalAmount, discount);
		printTicket(passengerName, ticketCount, ticketPrice, totalAmount, discount, finalAmount);

	}

	public static void greetPassenger(String name) {
		System.out.println("------------------------------");
		System.out.println("Welcome :- " + name);
		System.out.println("------------------------------");

	}

	public static int calculateAmount(int count, int price) {
		return count * price;

	}

	public static int calculateDiscount(int amount) {
		if (amount >= 2000) {
			return 2000;
		}
		return 0;

	}

	public static int calculateFinalAmount(int amount, int discount) {
		return amount - discount;
	}

	public static void printTicket(String name, int count, int price, int amount, int discount, int finalAmount) {

		System.out.println("----------- TICKET -----------");

		System.out.println("Passenger Name : " + name);
		System.out.println("Ticket Count   : " + count);
		System.out.println("Ticket Price   : " + price);
		System.out.println("Total Amount   : " + amount);
		System.out.println("Discount       : " + discount);
		System.out.println("Final Amount   : " + finalAmount);
		System.out.println("------------------------------");
		System.out.println(        "Thank You ! ! ! ");
		System.out.println("------------------------------");


		

	}
}
