class  Account
{
   public static void main(String args[])
   {
  System.out.println("----------------------------");

   System.out.println("main START");
   Account.showAccountInfo();
   System.out.println("main END.......");
   
   System.out.println("----------------------------");


   
   }
	private static void showAccountInfo(){
	System.out.println("Discplaying account Info.....");

	 }
	}
	
class AccountStatus{
		public static void  showAccountStatus() {
		 Account.showAccountInfo();     // we are using private, method  of Account class
		
	}

}


// I have done, I have developed the account class. Inside account class, 
I have…Method which is? Private. Method which is? private, 
This variable amount cannot be used outside account class. If you try to use it here, it will throw.
Edit.
Any question here?
Understood, private. Private means what?
within the class. You can call, or you can use within the class. Private variable, private method, private constructor. You can use anything which is private.
The scope of private is within class only, within…
class.

static String  Name = "rahul ujjawal"; // this is a defflot 
package ==.package is nothing? It's a namespace? Or the directory structure, where it will allow us to   Write the modular code, 

Package ==> kodewala.com.==> com.kodewala
infosys.com===> com.infosys
tcs.com  ==>  com.tcs

01 ==> \com\tcs\user\reatils\AccountMgmt.java

02 ==> \com\tcs\user\business\AccountMgmt.java

package is nothing this is a folder structure 


create Folder ==> 
 ==>com 
 ==>tcs
==> Account.java ----> this  is java file 

==> default. Who can access?  Default member. Who can accept default? Member. Default member. So, package, how do you declare?
The first line of Java program is, package. So, let's say I'll create a new class here.

==> what is modular 
========================================================================================================================
===> com. ==> kodewala ==> folder structure with this name 
--> com 
--> kodewala =>  I will save this file, 

com ---> package will statrted here 

Teminal ==> file location ==> 
day_11 -->    then   compile  --
==> javac    pacakeg_name --> java file name   

--> javac com/kodewala/AccountManagement.java 


 01 :- javac com/kodewala/AcountManagement.java     ==>account management  Java is there in this package? compiled this.
 02:- java com.kodewala.CollegeDetails

com/kodewala --> package_name  
AcountManagement.java --> file_name 


then ==> java com.kodewala.CollegeDetails
==============================================================================================================================
==> create folder inside ==> 
==>pwd
==>  /Users/rahulujjawal/Desktop/core_java_kodewala/day_11/com
 ==> mkdir tcs ==> create folder 
 
 day_11
└── com
    ├── kodewala
    └── tcs
--------------------------------------------------------------------------------------------------------------------------------------------------
multiple folders create karna in one time ==>
mkdir -p com/kodewala/employee
mkdir -p com/tcs/employee


mkdir -p com/hcl/employee/rahulujjawal
 
 
																			  


