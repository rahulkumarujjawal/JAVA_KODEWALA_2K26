 package com.kodewala;

public class Array {

	public static void main(String[] args) {
		Array.elementArray();
	}

	public static void elementArray() {

		//  how to read element 
		int marks[] = new int[5];
		
		// store Element to array (Storage)
	//	int  marks[] ={10,20,30,40,50,60,70,60,80,90,100}
		

		marks[0] = 20;
		marks[1] = 30;
		marks[2] = 45;
		marks[3] = 65;
		marks[4] = 70;

		marks[5] = 90;
		marks[6] = 78;
		marks[7] = 87;
		marks[8] = 90;
		marks[9] = 80;

		for (int i = 0; i < marks.length; i++) {

			int mark = marks[i];

			if (mark >= 50) {
				System.out.println(mark);
			}
		}
	}
}