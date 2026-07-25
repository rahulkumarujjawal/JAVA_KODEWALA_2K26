package day30.kodewala.covariant.returntype;

public class Customer {
	
	
	private void showDetails() {                            // method 1 
		System.out.println("Customers.showDetails");
		
	}
	
	Object calculatePrice(String itemName,int price, boolean status) {                // method 2
		System.out.println("Cutsomers.calculatePrice()");
		return new Object();
		
				
	}

}

class goldCustomers extends Customer {
	public String calculatePrice(String item,int rate , boolean b) {
		System.out.println("gold customers calculate price()");
		return "something";
		    
	}
}
class driver{
	public static void main(String[] args) {
		  
	}
}