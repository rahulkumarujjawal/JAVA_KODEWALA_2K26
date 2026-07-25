class AddTwoNumbers {
     
	 public static void main (String args[])   // jvm  is calling 
{     
System.out.println("Main Method  Start()");
	 String input1 = args [0];
	 String input2 = args [1];

int first = Integer.parseInt(input1);
int second = Integer.parseInt(input2);

int result = AddTwoNumbers.add(first ,second);
System.out.println(" sum of two numbers : " + result );
System.out.println(" End  Main()"  );

// the method from main ()
		  

		 }

static int add(int firstNumbers , int secondNumbers)
{
		System.out.println("  Start add() ");
		int sum = firstNumbers + secondNumbers;
        System.out.println("End Add() ");
		 return sum ;	
}





}