package day31.kodewala.override;


class ProductDelivery {
	 public void estimateTime(String src, String desti) {
		System.out.println("Delivery.estimate()");
	}

}

class ProductExpressDelivery extends Delivery_1{
	
	
	
	
public  void estimateTime(String src ,String desti) { // static method are hidden in child class 
		
		System.out.println("Express Delivery.estimate()");
	}
	
	
	
}




public class Driver_2 {
	public static void main(String[] args) {
		System.out.println();
	}

}
