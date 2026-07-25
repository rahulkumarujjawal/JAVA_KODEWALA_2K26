package com.hdfc;

public class PizzaOrder {

	public static void main(String[] args) {

		String customerName = "Rahul Ujjawal";
		String itemName = " chiken Pizza";
		int quantity = 3;

		String totalAmount = PizzaOrder.placeOrder(customerName, itemName, quantity);
		System.out.println(totalAmount);
	}

	public static String placeOrder(String customerName, String itemName, int quantity) {
		int amount = PizzaOrder.calculateAmount(quantity);
		return "Customer Name :-  " + customerName + "\nItem Name:-  : " + itemName + "\nQuantity : " + quantity
				+ "\nTotal Price : " + amount;

	}

	public static int calculateAmount(int quantity) {
		return quantity * 299;

	}

}
