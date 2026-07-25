class shopingApp{

public static void main(String args[])
{
	    System.out.println("=============================");
        System.out.println("  Welcome to MyShop Online!  ");
        System.out.println("=============================");
        printOrder("rahul ujjawal", "Nike shoe", "rahulujjawal@gmail.com" ,5000,87383783783L);
}

public static  void printOrder(String customerName ,String itemName,String customerEmail,double price, long mobileNumber){
	        System.out.println("Customer :- " +customerName);
			System.out.println("Item Name :- " +itemName);
			System.out.println("Email :-  "  + customerEmail );
			System.out.println("Price :- " + price);
			System.out.println("Mobile Number :- " + mobileNumber);

       }
	


}