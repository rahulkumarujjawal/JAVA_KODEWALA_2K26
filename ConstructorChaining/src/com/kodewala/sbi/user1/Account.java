package com.kodewala.sbi.user1;

public class Account extends Object {
	private String name;
	private int balance;

	Account() {

		/*
		 * 1st line of constructor with no arguments // SUPER MEANS -- PARENSTS CLASS //
		 * super(); // calling the super class no args constructors in super class -->
		 * // who is the // super class -- objects class object class --> no args --
		 * constructor
		 */
		this("rahul ujjawal", 30000); // this is another constructor
	}

	Account(String _name, int _balance) { // this one
		super(); // here calling another class constructor
		this.name = _name;
		this.balance = _balance;

	}

	Account(int _balance, String _name) { // this one
		this.name = _name;
		this.balance = _balance;
	}
}

/*
 * These are different constructors, Because order of arguments are different.
 * why do we need constructor ==> to initialize the State of the object. What is
 * the state of the object?==> Name and balance here.
 * 
 * what Constructors is doing, once you create Constructors, you cannot modify
 * it to become You need to recreate the object. need to recreate the object.
 * Kind of that become immutable.
 * 
 * --- java Relationship -- one class parents and one class child objects classs
 * in the top class in the java how do we represent parent? --There's a keyword
 * called extends
 * 
 * The relationship with parent and child, use keyword extends Account extends
 * Objects ---> Account is child class and Objects will parents class
 * 
 * Can child exist before parent ==>
 * 
 * The first line of construct will be always? Super with? No, even if you're
 * not writing, it is taken super with. No args . Constructer is always. Either
 * super or this, this also. This means calling same class constructor. Calling
 * same class super means calling. Super interest construct. If you're not
 * writing anything,
 * 
 * super ---> calling parents class Why it is failing? Because super class,
 * which is the super class. Object class doesn't have… Argument. Argument
 * cluster which is taking integers.
 * 
 * Account() == 1st line of constructor must be either super or this If you are
 * not writing, by default will be super with no. Argument. What? Super keyword
 * saying? It is calling superclass constructor. What this keyword says that ===
 * call the same class constructor
 * 
 * This keyword :- we call same class constructor Super keyword = parents class
 * calls //this Object class constructors -- Object class doesn't have any?
 * Argument all across it. Whenever you are creating object, whenever you are
 * creating I've checked. the constructor call go still ?
 * 
 * 
 */