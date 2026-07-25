class LoopInput{
        public static void main(String args[])  {
        LoopInput.printSomething(args);
   
   }

            private static void  printSomething(String input[]){
		   	 System.out.println("Total Number of Element :- " + input.length); 
 
             for(int  index = 1;  index < input.length ; index++){   
			  String city = input[index] ;
  		      System.out.println(city);                                                           

  }
 
       }


 }