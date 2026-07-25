class AtmSystem{
      public static void main(String args[])
{
int atmId = 101;
String bankName = "state bank of India";
String customersName = "Rahul ujjawal shrama";
String branchName = "gla college";
String ifscCode  = "SBIN000564";

long cardNumber = 1234566789L;
int  pin = 8272;
double balance = 857999;
double withdrawalAmount = 50000;
double availableBalance =   balance - withdrawalAmount;
String transactionStatus = "Sucess";


        System.out.println("ATM Id :- " + atmId);
        System.out.println("Bank Name :- " + bankName);
        System.out.println("Customer Name :- " + customersName);
        System.out.println("Branch Name :- " + branchName);
        System.out.println("IFSC Code :- " + ifscCode);
        System.out.println("Card Number :- " + cardNumber);
        System.out.println("PIN :- " + pin);
        System.out.println("Balance :- " + balance);
        System.out.println("Withdrawal Amount :- " + withdrawalAmount);
        System.out.println("Available Balance :- " + availableBalance);
        System.out.println("Transaction Status :- " + transactionStatus);



	  }



}