class PizzaOrder{

		       public static void  main(String args[]){
				   
			   int totalAmount = PizzaOrder.placeOrder("chiken pizza", 4);
			System.out.println("Total Price :- " + totalAmount);
			   
 }
		   public static int placeOrder(String pizzaName , int quantity){
		   return PizzaOrder.getPrice(quantity);
		   
 }
		   public static int  getPrice (int quantity){
			   return quantity * 300;
 }

}