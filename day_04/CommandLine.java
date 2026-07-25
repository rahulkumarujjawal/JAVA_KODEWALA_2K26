class CommandLineArgs{
          public static void main (String args[]){
			  
			    
		 System.out.println("______________________________"); 
		 System.out.println("====> Welcome to Java Coding <===== ");
		 System.out.println("stat main() Finctions;");
		  
		 String FirstNumbersStr = args[0]; 
		 String SecondNumbersStr = args[1]; 
		 
		 
 // convert the number which is String Format("1" ======> 1)l
 
          int FirstNumber = Integer.parseInt(FirstNumbersStr);
		  int SecondNumber = Integer.parseInt(SecondNumbersStr);

         int  sum = FirstNumber +SecondNumber;
		  
		  System.out.println("Total_Number_of_sum :- "+ sum);
		  System.out.println("End main methods();");
		  System.out.println("______________________________"); 

         }

 }