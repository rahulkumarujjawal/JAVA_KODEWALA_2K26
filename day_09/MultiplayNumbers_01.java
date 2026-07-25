class MultiplayNumbers_01{
public static void main(String args[]){
	
System.out.println("Stat Main Method()");

String input1 = args[0];
int first = Integer.parseInt(input1);

String  input2 = args[1];
int second = Integer.parseInt(input2);

String  input3 = args[2];
int third = Integer.parseInt(input3);

int  sum = MultiplayNumbers_01.multiplay(first,second ,third);

System.out.println("Total numbers :- " +  sum);
System.out.println("End Main Method");

 }
   
static int multiplay( int first ,  int  second , int third){

int sum = first * second * third;
return sum;

   }

}