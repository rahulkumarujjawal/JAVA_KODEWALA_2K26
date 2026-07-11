package com.kodewala.constructors01;

public class Mobile {

	Mobile() {
		System.out.println("Mobile is ready");
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
	}
}


/* 
 
===>  Real-Life Example
Imagine you buy a new mobile phone.

When you switch it on for the first time:

Language is selected
Date & time are set
SIM card is detected
Wi-Fi is configured

Only after these initial settings is the phone ready.

A constructor does exactly the same thing for a Java object.
Mobile mobile = new Mobile();

Step 1 → Load the class (if not already loaded)
↓
Step 2 → Allocate memory in the Heap
↓
Step 3 → Set default values

==========
Constructor Rules

Constructor name must be the same as the class name.
Constructors have no return type.
Constructors are called automatically.
Constructors can have parameters.
Constructors can be overloaded.
Constructors cannot be:  ===> static ==> final ==> abstract
A default constructor takes no parameters.

Parameterized Constructor  ==>
class Student{
String name;
String Address;
int age;

this.name = name;
this.Address = Address;
this.age = age;

Main method me ==

public static void main(String[] args){
Student student  = new Student("Rahul", "Benglore" ,12);

Student Object  and name rahul and address = benglore = age = 22


Constructor Overloading
Multiple constructors with different parameter lists.

class Student {
Student() {
System.out.println("Default");
}
Student(String name) {
System.out.println(name);
}

Student(String name, int age) {
System.out.println(name);
System.out.println(age);

    }

}


 
}





 */
