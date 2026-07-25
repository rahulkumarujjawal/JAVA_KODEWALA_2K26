package com.kodewala.array;

public class ArrayProblem02 {
	public static void main(String[] args) {
		
		int[] subjectMarks = { 20, 30, 40, 50, 60, 74, 04, 80, 89, 90, 68};
		
		for (int i = 0; i < subjectMarks.length; i++) {
			
			int mark = subjectMarks[i];
			 
			if(mark >=50){
				System.out.println("You Clear the Exam :- "+ mark);

				
			}else {
				System.out.println("You Not Clear the Exam :- " + mark);
			}

		}
	}

}
