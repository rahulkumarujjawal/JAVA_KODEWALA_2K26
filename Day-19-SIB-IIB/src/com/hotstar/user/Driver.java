package com.hotstar.user;

public class Driver {
public static void main(String[] args) {
	HotStarUser hotStarUser = new HotStarUser("bsdwinidjhwuhwuwji121313");
	HotStarUser hotStarUser1 = new HotStarUser("bsdwinidjhwuhwuwji121313","paid");

	HotStarUser hotStarUser2 = new HotStarUser("bsdwinidjhwuhwuwji121313");

	HotStarUser hotStarUser3 = new HotStarUser("bsdwinidjhwuhwuwji121313","widjwiod");
	System.out.println("Total Viewers:- " +HotStarUser.totalViewers);
	
	// call the non static  method 
	hotStarUser3.doSomething();

}
}
