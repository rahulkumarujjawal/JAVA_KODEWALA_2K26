class AndOperator {

 public static void main(String args[]) {
 
String state = args[0];
String marks = args[1];
int marksIn = Integer.parseInt(marks);


System.out.println("-----------------------------");

 if( marksIn >=  75 || state.equals("Karnataka"))
 {
 System.out.println("Allowed  to Take a Addimission in Kodewala Academy");

 
 }
 else {
 System.out.println("you are not allowed  to take a Addimission in Kodewala Academy ..Your Details are:-  "  + state + " and " + marksIn);
 
System.out.println("-----------------------------");


     }
    }
}


