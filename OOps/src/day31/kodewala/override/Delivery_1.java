package day31.kodewala.override;

public class Delivery_1 {
	void estimateTime(String src, String desti) {
		System.out.println("Delivery.estimate()");
	}

}

class ExpressDelivery extends Delivery_1{
	
	void estimateTime(String src ,String desti) { // static method are hidden in child class 
		
		System.out.println("Express Delivery.estimate()");
	}
	
	
	
}


class Driver{
	public static void main(String[] args) {
		
	}
}