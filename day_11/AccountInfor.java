package com.tcs.employee;

class Accoount {
      public static void main(String[] args) {
		  
      System.out.println("MAIN METHOD WILL START");
      Accoount.showAccountStatusInfo();
      AccountStatus.showAccountStatus();
      System.out.println("END MAIN METHOD");
	  
  }

        public static void showAccountStatusInfo() {
        System.out.println("DISPLAY ACCOUNT INFO");
    }
}

class AccountStatus {
	        public static void showAccountStatus() {
			Accoount.showAccountStatusInfo();
			System.out.println("ACCOUNT STATUS METHOD");

    }
}