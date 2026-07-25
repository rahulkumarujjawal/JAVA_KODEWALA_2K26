package com.kodewala.arrayContinue;

public class ArrayContinue {
	public static void main(String[] args) {
		int[] numbers  = {10,20,30,40,50,60 ,-50,-70,100,40,80,78,-60,85,96,99,95,99};
		
		for(int index =0; index<numbers.length;index++) {
			int num = numbers[index];
			if (num <= 80) {
				continue;
			}
			
			
			System.out.println("-----------------------");
            System.out.println("    ARRAY-CLASSESS"     );
			System.out.println("------------------------");

			
			
			System.out.println("-----------------------");
            System.out.println("Best Score:-       " +num);
			System.out.println("------------------------");

		}
	}

}
