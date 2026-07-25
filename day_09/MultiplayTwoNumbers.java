class MultiplayTwoNumbers {
     
	 public static void main (String args[])   // jvm  is calling 
{ 
    
System.out.println("======================");

System.out.println("Main Method  Start()");

	 String input1 = args [0];
	 String input2 = args [1];

int first = Integer.parseInt(input1);
int second = Integer.parseInt(input2);

int result = MultiplayTwoNumbers.multiplay(first ,second);

System.out.println(" sum of two numbers : " + result );

System.out.println(" End  Main()"  );   // the method from main ()


		  
 }

static int multiplay(int firstNum , int secondNum)
{
System.out.println("  Start add() ");
int sum = firstNum  * secondNum;

System.out.println("End Add()  ");
System.out.println("======================");

return sum ;	


      }

}