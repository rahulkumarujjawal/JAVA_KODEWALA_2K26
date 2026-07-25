class OrderApp{

public static void main(String args[]){
OrderApp.placeOrder("rahul ujjawal" ,"pune", "8709949334" , "rahul@gmail");

}

public static boolean placeOrder(String name ,String productName , String address, String productBrand ,String emails){
System.out.println("Order  has been sucesfull " + name +  " " + address + " " + numbers +  " " + emails);  
boolean Invoice = OrderApp.Invoice("8709949334");
boolean orderUpdateEmails = OrderApp.orderUpdateEmails("rahul@gmail");
boolean yourPayment = OrderApp.yourPayment("oreder deliverd");
return true;


}

public static boolean Invoice(String numbers ){
System.out.println("Invoice Generated  send to phone  numbers " + numbers );  
return  true;
}

public static String orderUpdateEmails(String Emails ){
System.out.println("Order has been update Sucessfull send to mai id:- " + Emails);  
return  true;

}
public static boolean yourPayment(){
System.out.println("Payement  has been sucesfull ! ! ! ");  
return  true;



}
 

}