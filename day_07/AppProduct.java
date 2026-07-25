class AppleProduct {

static double gstPercentage = 18.0; // static is all commaon for 

 public static void main(String args[]) {
 
String productName = "iPhone16";
int productPrice = 100000;
double gstAmount = productPrice+productPrice * gstPercentage / 100;

System.out.println("----------------------------");

        System.out.println("Product Name :- " + Product.productName);
        System.out.println("Product Price  :- " + Product.productPrice);
 //        System.out.println("GST Percentage  :- " + Product.gstPercentage + "%");
        System.out.println("GST Amount        :- " + Product.gstAmount);
        System.out.println("Total Amount      :- " + Product.totalAmount);
		
System.out.println("-------------------------------");

		
		
		
		
		
    }
	
	
}