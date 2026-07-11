package com.kodewala.SIB.IIB;

public class SbiBank {   //-------------- Parents class 

	
	static String bankName = "State Bank of India";     //  -------- Static Variable

	
	String branch;          // ---  Instance Variable

	// Static Initialization Block
	static {
		System.out.println("SIB : Bank Class Loaded");
	}

	// Instance Initialization Block
	{
		System.out.println("IIB : Bank Object Creating");
	}

	// Constructor
	SbiBank() {
		System.out.println("Bank Default Constructor");
	}

	SbiBank(String branch) {
		this.branch = branch;
		System.out.println("Bank Branch : " + branch);
	}

	// Method
	void bankDetails() {
		System.out.println("Bank Name : " + bankName);
		System.out.println("Branch : " + branch);
	}
}
