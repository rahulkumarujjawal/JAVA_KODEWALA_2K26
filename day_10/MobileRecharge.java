class MobileRecharge
    {
			public static void main (String args[] ){
			int balance = MobileRechargeSystem.recharge("Rahul_Ujjawal", 299);
			System.out.println("Update balance :- " + balance) ;
			
			
	}

		    public static int recharge(String customerName , int customerAmount) {
		    int updateBalance = MobileRechargeSystem.calculateBalance(customerAmount);
			return updateBalance;
	}
			public static int calculateBalance(int amount){
			 return amount + 100;
	
	
	}



}