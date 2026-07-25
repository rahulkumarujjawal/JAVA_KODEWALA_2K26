package com.amazonn.user;

public class NumberCount {

	// write a progrrame to count the numbers of objects creatd in the sytem

	public String useId;
	public String name;

	static int totalCount = 0;

	{
		totalCount++;
		System.out.println("Object Created : " + totalCount);
	}

	NumberCount() {
		System.out.println("Total view");
	}

	public static void main(String[] args) {
		NumberCount user1  = new NumberCount();
		NumberCount	user2  = new NumberCount();

		NumberCount	user3  = new NumberCount();

		
	    System.out.println("Total Views  = " + NumberCount.totalCount);


	}
}
