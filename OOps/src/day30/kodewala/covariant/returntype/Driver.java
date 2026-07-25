package day30.kodewala.covariant.returntype;

class Delivery {

	public Post doDelivery() {
		System.out.println("Delivery.doDelivery");
		return new Post();
	}

}

class OneDayDelivery extends Delivery {

	@Override
	public SppedPost doDelivery() {
		System.out.println("One DayDelivery.doDeliver");
		return new SppedPost();

	}
}



public class Driver {
	public static void main(String[] args) {
		OneDayDelivery oneDayDelivery = new OneDayDelivery();
		oneDayDelivery.doDelivery();

	}

}





/*
 * The covariant data type is nothing. Whenever we are overriding the method.
 * child class method. May return… Superclass methods? Written types, child.
 * Superclass methods written type is? Date and time is post, so this can be the
 * same post or child of the post.
 * 
 */
