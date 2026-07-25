class MovieTicketBooking{
          public static void main(String args[])
		  {
		  int totalAmount = MovieTicketBooking.bookTicket("rahul ujjawal" ,4);
		  System.out.println("Total Amount :- " + totalAmount);
		  }
		  public static int bookTicket(String customerName, int seats){
		  int amount    =    MovieTicketBooking.calculatePrice(seats);
		  return amount;
		  }

		public static int calculatePrice(int seats){
		return seats * 300;
		
		}




}