class OpeartorsConditions {
public static void main(String args[])
{
	
String ageStr = args[0];

int  applicationAge  =  Integer.parseInt(ageStr);
int minAge =  18; 
int maxAge = 60;

if(applicationAge >= minAge    &&   applicationAge <= maxAge)
{
System.out.println(" Welcome to join  IIT college ! ! ! ! ");
}

else{ 
System.out.println("Soory ! you are not allowed. your marks is below :- " + applicationAge);

}

	 }
} 