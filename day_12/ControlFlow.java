class ControlFlow{
   public static void main(String args[])  {
	   
	int amount = Integer.parseInt(args[0] );  
	  
	boolean result =    ControlFlow.checkDelStatus(amount);
	System.out.println("customer delivery status(true :free | false : paid ) :" +result);


     }
	   private static boolean checkDelStatus (int amount ) {                 	   //-------------------  get free delivery if order value is 350 and above 
		boolean status = false;                                                           // --------------------    local variables 
		if( amount >= 10000 ){
	     System.out.println("inside  if block");
	     status = true;
			    
		  }
		                                                                        // --------------------  ture or false
		  else
	  {
		 System.out.println("inside  else  block");

	  }  
	  return status;    // true or false
	  } 
	  
	 
	   
	   
	   
}


// if false  block is false then  '