package AIntroClass.pwc;

public class StudentPgfood {
    public static void main(String[] args) 
    {
    int time = Integer.parseInt(args[0]);
    boolean result = StudentPgfood.pgFoodTime(time);
    System.out.println(result);
    }
    private static boolean pgFoodTime(int foodTime){
boolean status = false;
if(foodTime >=8  && foodTime <= 10){
    System.out.println("you will get");
    status = true;
} 
else
{
    System.out.print("you will not get :");

}
return status;

    }
}
