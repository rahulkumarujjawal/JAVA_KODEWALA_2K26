package com.Kodewala.Academy.Test_04;

public class Question01 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("java");
		System.out.println(s1 == s3);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
}
