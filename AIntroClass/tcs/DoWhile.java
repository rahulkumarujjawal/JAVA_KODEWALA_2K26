package AIntroClass.tcs;

public class DoWhile {
    public static void main(String[] args) {
        DoWhile.doSome();
    }
    public static void doSome(){
        int number = 1;
        while(number < 1000){
            System.out.println(number);
            number = number +1;
        }
    }
    
}
