class AddNumbers{

public static void main(String args[]){
System.out.println("Start main");  

String input1 = args[0];
String input2 = args[1];

int first = Integer.parseInt(input1);
int second = Integer.parseInt(input2);

int result = AddNumbers.add(first,second);
System.out.println("Sum of two numbers :- " + result);  
System.out.println("End main");  

}

 public static int add (int firstNumbers , int secondNumbers){
System.out.println("stat add()");
int sum = firstNumbers  +secondNumbers;
System.out.println("End add()");
return sum ;

     }

}