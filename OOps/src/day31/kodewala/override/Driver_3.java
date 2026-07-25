package day31.kodewala.override;

class Delivery{
	static void estimateTime(String src,String destination) {        // this is a part  of overhiding
		System.out.println("delivery.estimateTime()");
	}
	
}

class ExpDelivery extends Delivery{
	
	static void estimateTime(String src,String destination) {  // static method are hidden in child class 
		System.out.println("delivery.estimateTime()");
	}
	
	
	
	
}




public class Driver_3 {
public static void main(String[] args) {
	
}
}


/*
 * if a static method  :- not a overriding  this is a  
 * method hiding  Static method will be hidden in the child class.
 * not override => static and private 
 * 
 * It's not the example of overriding, because static cannot be What would he do?
 Overridden happens at runtime 
static belongs to class.
And static will be decided.
At the time of compilation only, which method to be called.
 */
