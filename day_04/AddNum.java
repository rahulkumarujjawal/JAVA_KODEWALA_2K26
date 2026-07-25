class AddNumbers {

    public static void main(String[] args) {

        String firstNumberStr = args[0];
        String secondNumberStr = args[1];
		
		// Convert the number which  is in String format ("1" ----> 1)

        int firstNumber = Integer.parseInt(firstNumberStr);
        int secondNumber = Integer.parseInt(secondNumberStr);

        int sum = firstNumber + secondNumber;
		
		System.out.println("_____________________________________" );
        System.out.println("Welcome to Java Coding" );


        System.out.println("Sum is :-  " + sum);
        System.out.println("End main method () ");
		
	    System.out.println("_____________________________________" );

		
		
		
    }
	
	
}