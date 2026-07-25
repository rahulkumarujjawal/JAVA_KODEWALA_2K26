package com.kodewala.covariant;

class Delivery {
	 
	public Post doDeliver() {
		System.out.println("Delivery Sucessfully");
		return new Post();

	}

}

class OneDayDelivery extends Delivery {
	
	
	@Override
	public SpeedPost doDeliver() {
		System.out.println("one day Delivery.doDelivery");
		return new SpeedPost();
	}
}

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("dgwdwkd ijwdjio ");
		Delivery delivery = new OneDayDelivery();
		delivery.doDeliver();
		

	}

}
