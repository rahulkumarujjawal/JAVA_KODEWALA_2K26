class Operator {

 public static void main(String args[]) {
 
String ageStr = args[0];
int applicationAge = Integer.parseInt(ageStr);
int minAge = 18;
int maxAge = 60;
System.out.println("-----------------------------");

 if(applicationAge >= minAge && applicationAge <= maxAge){
 System.out.println("Allowed  to apply for DL");

 
 }
 else {
 System.out.println("you are not allowed  to apply fo DL  your age is  .." + applicationAge);
 
System.out.println("-----------------------------");


     }
    }
}