package com.kodewala.Strings;

public class StringDriver {
	public static void main(String[] args) {
//		String s1 = "rahul";
//		String s2 = "rahul";
		String s3 = new String("rahul");
		
		String s4 = s3.intern();
		System.out.println(s4 == s3);
	}
}
