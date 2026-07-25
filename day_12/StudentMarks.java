class StudentMarks 
{
public static void main(String[] args) 
{

int marks = Integer.parseInt(args[0]);
boolean result = StudentMarks.studentMarks(marks);
System.out.println("You take admission :- " + result);
    }

public static boolean studentMarks(int marks) {

boolean passingMarks = false;

if (marks >= 80) {
passingMarks = true;
 } else {
System.out.println("Inside the else block");
   }
 return passingMarks;
    }
}



// Shift + Command (⌘) + 3.