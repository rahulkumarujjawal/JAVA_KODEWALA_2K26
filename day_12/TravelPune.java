 class TravelPune {
        public static void main(String args[])
       {
		int result  = Integer.parseInt(args[0]);
		TravelPune.takeDecision(result);
        }
		 public static void takeDecision(int amount)
   {
	  if(amount >= 10000) 
	{
		System.out.println("User will go by air");
	}
	  else if (amount < 10000 && amount >=5000)
	{
		System.out.println("User will go by train");
    }
	  else if (amount < 5000 && amount >=1000 )
{
		System.out.println("User will go by bus");
    }
	 
	else
	{
		System.out.println("User dont fell like going") ;

		}
		
		
	}
}