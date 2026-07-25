class ATM{
	    public static void main(String args[]){
			
		String result = ATM.withDrawMoney("2522262727" ,4000) ;
		System.out.println(result) ;
																	   
}          
             public static String withDrawMoney(String accountNum, int amount){
			 boolean accountStatus =   ATM.checkAccount(accountNum);
			 int Balance = ATM.getBalance(accountNum);
			 
			 if (accountStatus && Balance >=amount) {
			 String cashStatus = ATM.dispanceCash(amount);
			 return cashStatus;
			 }
			 return "Insufficinent Balance";
}
	 
	 public static boolean checkAccount(String accountNum) {
	 return true ;
  }
	 
	 public static int  getBalance(String accountNum) {
	  return 5599 ;
  }
	  public static String dispanceCash(int amount) {
	  return "Cash Dispensed : " + amount;
	
	
  }
  
}                                                                                                              