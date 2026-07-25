package com.kodewala.strings06;

public class Strings02 {
	public static void main(String[] args) {
		String temp = "Benglore"; // SCP but no refering
		String s1 = new String(temp);

		String address = "Benglore";
		address.concat("India"); // india will created in SCP
									// new object will be created

		System.out.println(address);

		// Two object will created on in heap and one in sop
		String s10 = "Mumbai"; // SCP
		String s11 = "Mumbai"; // already "Mumbai" in scp so it wont create new objects
		System.out.println(s10 == s11); // true

		String s12 = new String("Ranchi"); // heap and one copy In scp
		String s13 = new String("Ranchi"); // HEAP
		System.out.println(s12 == s13); // False

		String s14 = "rahul kumar ujjawal sharma";
		String s15 = "rahul kumar ujjawal sharma";
		System.out.println(s14 == s15);

		String s25 = "rahul ujjjawal sharma";
		String s26 = new String("rahul ujjjawal sharma");
		System.out.println(s25 == s26);

		String s101 = "rahul ujjawal sharma";
		String s102 = " ujjawal sharma";
		System.out.println(s101 == s102);

		String dog = "dog";
		String animal = "lion";
		System.out.println(dog == animal);

		String name = "RAHUL KUMAR UJJAWAL";
		name.concat("kumar");
		System.out.println(name);

		String s103 = new String("java");
		String s104 = new String("java");
		System.out.println(s103.equals(s104));

		String s = "Rahul";
		s.concat(" Kumar");
		System.out.println(s);

		String st = null;
		System.out.println("Java".equals(st));

//       String sh = null;
//       System.out.println(sh.equals("Java"));

		String string = "ABC";
		String t = string.concat("XYZ");

		String name1 = "Hello Anshu ";
		System.out.println(name1.length());

		String s111 = "Java";
		s111.toUpperCase();
		System.out.println(s111);

	}

}
