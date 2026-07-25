package com.kodewala.inheritance.covarient.type;

class Delhivery {
	public Post dodelivery() {
		System.out.println("");
		return new Post();
	}
}

class OneDayDelivry extends Delhivery {

	public SpeedPost doDeliver() {
		System.out.println("");
		return new SpeedPost();
	}
}

public class Driver {

}
