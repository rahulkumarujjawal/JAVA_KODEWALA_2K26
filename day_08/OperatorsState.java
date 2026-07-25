class OperatorsState{

public static void main (String args[])
{
String state = args[0];
String marks = args[1];
int  marksIn = Integer.parseInt(marks);

  
    if(marksIn >= 75 || state.equals("karnataka"))   // if block 
{
System.out.println(" Welcome to join  KodeWala Acadamy ");
}

else {
System.out.println(" Sorry !!  you are not allowed  to KodeWala Acadamy. Your Details are : " +   state +  "and " + marks);

 
}

     }

}