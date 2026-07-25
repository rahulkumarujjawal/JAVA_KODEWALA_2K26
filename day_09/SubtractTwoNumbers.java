class SubtractTwoNumbers{

public static void main (String args[]){
   
System.out.println("==================================");
System.out.println("WELCOME_TO_KODEWALA_ACADEMY");
System.out.println("==================================");
System.out.println("Main Method  Start() ");

String input1 =  args[0];
String input2 = args[1];
String input3 = args[2];
String input4 = args[3];

int firstNum = Integer.parseInt(input1);
int secondNum = Integer.parseInt(input2);
int thirdNum = Integer.parseInt(input3);
int fourthNum = Integer.parseInt(input4);
int totalValue = SubtractTwoNumbers.subtract(firstNum, secondNum, thirdNum, fourthNum);
System.out.println("Total  Numbers of values :-  " + totalValue);

 }
	  	  
static int subtract(int firstNum , int secondNum ,int thirdNum,int fourthNum){

System.out.println("Start add() ");
int totalValue = firstNum - secondNum - thirdNum - fourthNum;
System.out.println("End Add()  ");
System.out.println("======================");
return totalValue ;	

        }

}







