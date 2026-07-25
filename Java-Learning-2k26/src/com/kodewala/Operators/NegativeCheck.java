package com.kodewala.Operators;

import java.util.Iterator;

public class NegativeCheck {
public static void main(String[] args) {
	int number[] = {10,20,-40,60,80 -99,-75,100};
	for(int index = 0; index <number.length; index ++) {
		if(number[index]<0) {
			System.out.println("Your Number is Negtaive :- " + number[index]);
		}
	}
}
}
