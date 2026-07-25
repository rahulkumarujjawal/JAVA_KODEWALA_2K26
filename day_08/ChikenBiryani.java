class ChikenBiryani{

public static void main (String args[]){

String Biryani = args[0];
int  birynaiPrice = Integer.parseInt(args[1]);

  
if(birynaiPrice >= 399 || Biryani.equals("ChikenBiryani"))  { 
System.out.println(" Kha Lunga ");
}
else
{
System.out.println(" Sorry !!  Nahi Khayenge : " +   Biryani +   "and " +  birynaiPrice);

 
               }

     }

}