package com.hdfc.user;

public class HDFCUser {
	private int userId;
	private String name;
	private int age;
	private String accountType;
	private int balance;
	private String loctaion;

    HDFCUser(String name){
        System.out.println("welcome to the hdfc bank ");
    }

    HDFCUser(int _userId,String _name,int _age, String _accountType , int _balance, String _location){
    	userId = _userId;
    	name = _name;
    	age = _age;
    	accountType = _accountType;
    	balance =  _balance;
    	loctaion = _location;
    	
    }
 public void customerDetails() {
	 System.out.println("_____________________________");
	 System.out.println("User Id :- " + userId);
	 System.out.println("Name :- " + name);
	 System.out.println("Age :- " + age);
	 System.out.println("Account Type :- " +accountType);
	 System.out.println("Account Balance :- " + balance);
	 System.out.println("Location :- " + loctaion);
	 
	 System.out.println("________________________________");

	 
 }

    public static void main(String[] args) {
    	
    	System.out.println(".....Main Method Start.....");
    	
        HDFCUser User1 = new HDFCUser("RAHUL UJJWAL SHARMA"); 
        HDFCUser details  = new HDFCUser(1023,"Rahul ujjawal sharma",22,"saving",33333,"benglore");
        
        details.customerDetails();
        
        System.out.println("Main Method is End");
        
        
        
        System.out.println("--------------------------------");
		System.out.println("----------Thank You ! !---------");
		System.out.println("--------------------------------");
              

	}

}
