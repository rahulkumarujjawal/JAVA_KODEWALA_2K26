package com.functionaLInterfaces;

interface StudentPercentage1{
	int studentMarks(int english, int math );
}
public class StudentPercentage {
	
	public static void main(String[] args)
	{
		StudentPercentage1 studentPercentage = (	_English, _Math) -> {
			int totalMarks = _English + _Math;
			return totalMarks;
			
		};
		
		
		int  TotalMarks = studentPercentage.studentMarks(80,90);
		System.out.println("TotalMarks :- " +TotalMarks);
		
	}

}
