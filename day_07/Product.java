class Product {

static String productName = "iPhone16";
static int productPrice = 100000;
static double gstPercentage = 18.0;
static double gstAmount = productPrice * gstPercentage / 100;
static double totalAmount = productPrice + gstAmount;

 public static void main(String args[]) {
System.out.println("----------------------------");

        System.out.println("Product Name :- " + Product.productName);
        System.out.println("Product Price  :- " + Product.productPrice);
        System.out.println("GST Percentage  :- " + Product.gstPercentage + "%");
        System.out.println("GST Amount        :- " + Product.gstAmount);
        System.out.println("Total Amount      :- " + Product.totalAmount);
		
System.out.println("-------------------------------");

		
		
		
		
		
    }
	
	
}