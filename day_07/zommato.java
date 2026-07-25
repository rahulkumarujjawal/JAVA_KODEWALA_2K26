class Zommato {

static double gstPercentage = 18.0;

public static void main(String args[]) {

String itemName = "Chicken Curry";
 int productPrice = 399;

 double gstAmount = productPrice * gstPercentage / 100;
 
double totalAmount =      productPrice + gstAmount;   
               

        System.out.println("----------------------------");
        System.out.println("Item Name :- " + itemName);
        System.out.println("Price :- " + productPrice);
     //    System.out.println("GST Percentage :- " + gstPercentage + "%");
        System.out.println("GST Amount :- " + gstAmount);
        System.out.println("Total Amount :- " + totalAmount);
        System.out.println("----------------------------");
    }
}