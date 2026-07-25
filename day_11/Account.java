package com.kodewala;
class Accoount {
public static void main (String args[]) {
System.out.println("MAIN METHOD WILL START") ;

   Accoount.showAccountStatusInfo();
   System.out.println("End  main mehod " );

}
  public static void showAccountStatusInfo(){
	 System.out.println("discplay account info ");

   
   }                                                                                      

}
class AccountStatus{
	
	
	public static void showAccountStatus(){
	Accoount.showAccountStatusInfo();      // we are using private method account class         
		
	}
} 