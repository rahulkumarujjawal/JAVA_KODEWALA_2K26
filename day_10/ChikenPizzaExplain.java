class PizzaOrder
{
    public static void main(String args[])
    {
        String customerName = "Rahul Ujjawal";
        String itemName = " chiken Pizza";
        int quantity = 3;

        String totalAmount =   PizzaOrder.placeOrder(customerName,  itemName,  quantity  );
        System.out.println(totalAmount);
    }

       public static String placeOrder(  String customerName,    String itemName, int quantity){
       int amount =    PizzaOrder.calculateAmount(quantity);
       return "Customer Name :-  " + customerName +     "\nItem Name:-  : "  +  itemName +  "\nQuantity : " + quantity + "\nTotal Price : " + amount;
	  
	  }

      public static int calculateAmount( int quantity){
        return quantity * 299;
		
    }
}

 =========================================================================================================================

Method  ==> 
main()
placeOrder()
calculateAmount()


main()             = Boss

placeOrder()       = Manager

calculateAmount()  = Accountant

Variables ==> 
String customerName = "Rahul";

String itemName = "Pizza";

int quantity = 2;

String result;

int amount;

Variable = Data rakhne ka dabba 📦
customerName = Rahul
itemName = Pizza
quantity = 2

Step 3 : Arguments Kaunse Hain?
Jab method call karte ho:

PizzaOrder.placeOrder(
    customerName,
    itemName,
    quantity
);


customerName
itemName
quantity

Method ko jo value bhejte ho
usko Argument bolte hain.

Step 4 : Parameters Kaunse Hain?
Method receive karta hai:

public static String placeOrder(
        String customerName,
        String itemName,
        int quantity)
		
		
String customerName
String itemName
int quantity


Method jo value receive karta hai
usko Parameter bolte hain


Call Time.

placeOrder(
    customerName,
    itemName,
    quantity
);

RECEIVE TIME :- 
placeOrder(
    String customerName,
    String itemName,
    int quantity
)


Step 5 : Method Calling Another Method
int amount = PizzaOrder.calculateAmount(quantity);


placeOrder() ne

calculateAmount()

ko call kiya.

main()
  |
  v
placeOrder()
  |
  v
calculateAmount()

return quantity * 200;

main()
 |
 | customerName="Rahul"
 | itemName="Pizza"
 | quantity=2
 |
 v

placeOrder(
 Rahul,
 Pizza,
 2
)

 |
 | calls
 v

calculateAmount(2)

 |
 | 2 * 200
 |
 v

return 400

 |
 v

placeOrder()

 |
 | creates final message
 |
 v

return order details

 |
 v

main()

 |
 v

System.out.println(result) ;


Method
  ↓
Kaam karne wala worker

Variable
  ↓
Data rakhne ka box

Argument
  ↓
Method ko bheji hui value

Parameter
  ↓
Method ke andar value receive karne wali jagah

Return
  ↓
Method ka answer

JAVA METHOD RULES :- 

Rule 1: Method ka naam hona chahiye 

public static String placeOrder()
{
    return "Order Placed";
}
placeOrder = Method Name

Rahul = Name
placeOrder = Method Name

Rule 2: Return Type likhna padta hai
public static String placeOrder()
Yahan:

String = Return Type

Matlab method text return karega.

Example:

public static int calculateAmount()
{
    return 500;
}

Yahan:

int = number return karega
Rule 3: Method ke brackets () hote hain
placeOrder()

Ya

placeOrder("Pizza", 2)

Brackets ke andar parameters hote hain.

Rule 4: Parameter aur Argument match hone chahiye

Method:

public static String placeOrder(
        String itemName,
        int quantity)

Call:

placeOrder("Pizza", 2);

Match:

String -> "Pizza" ✔

int -> 2 ✔

Wrong:

placeOrder(2, "Pizza");

❌ Error

Kyun?

String expected
int mila
Rule 5: Method call karna padta hai

Method likh dene se nahi chalta.

public static String placeOrder()
{
    return "Order Placed";
}

Ye sirf method bana diya.

Chalne ke liye:

placeOrder();

call karna padega.

Real Life:

Chef kitchen me baitha hai.

Jab tak order nahi doge:

Chef kaam nahi karega.
Rule 6: Return Type aur Return Value match hone chahiye

Method:

public static int calculateAmount()
{
    return 500;
}

✔ Correct

Wrong:

public static int calculateAmount()
{
    return "500";
}

❌ Error

Kyun?

Method int maang raha hai
String mil raha hai
Rule 7: void method return nahi karta
public static void sendEmail()
{
    System.out.println("Email Sent");
}

Yahan:

void = koi value return nahi

Wrong:

public static void sendEmail()
{
    return "Email Sent";
}

❌ Error

Rule 8: Static method ko static method se direct call kar sakte hain
public static void main(String args[])
{
    placeOrder();
}

Ya:

PizzaOrder.placeOrder();

Rule 9: Ek method dusre method ko call kar sakta hai
public static String placeOrder()
{
    int amount = calculateAmount();

    return "Amount : " + amount;
}

Flow:

placeOrder()
     |
     v
calculateAmount()
Rule 10: Variable ki scope hoti hai
public static void placeOrder()
{
    int amount = 500;
}

amount sirf isi method ke andar dikhega.

Wrong:

public static void main(String args[])
{
    System.out.println(amount);
}

❌ Error

Kyun?

amount main() me exist hi nahi karta
Golden Format

Har method lagbhag is format me hota hai:

accessModifier static returnType methodName(parameters)
{
    // logic

    return value;
}

Example:

public static int calculateAmount(
        int quantity,
        int pricePerItem)
{
    int total = quantity * pricePerItem;

    return total;
}

Yahan:

public      -> Access Modifier

static      -> Static Keyword

int         -> Return Type

calculateAmount -> Method Name

(quantity, pricePerItem)
            -> Parameters

return total
            -> Return Value
Memory Trick

Method ko hamesha 5 parts me dekho:

public static int calculateAmount(int q, int p)

Break karo:

public      -> Kaun access karega

static      -> Object chahiye ya nahi

int         -> Kya return karega

calculateAmount
            -> Method Name

(int q, int p)
            -> Inputs (Parameters)

"Text"      -> Fixed text

variable    -> Actual value

+           -> Join (jodna)

\n          -> New line

return      -> Poora result wapas bhej do

 =========================================================================================================================
Java Access Modifiers :- 
1. public
2. protected
3. default (no modifier)
4. private
===========================================
01 Public :- 

Sab jagah se access kar sakte ho.

class Student
{
    public String name = "Rahul";

    public void display()
    {
        System.out.println(name);
    }
}

Use:

Student s = new Student();
System.out.println(s.name);
s.display();

✅ Same class
✅ Same package
✅ Different package
✅ Child class

===========================================
02 Private Method :- 
class Atm{
	
	private int pin = 224;
	private void main verifyPin(){
		System.out.println("Pin verified");
	}
}
ATM atm = new ATM ();
ystem.out.println(a.pin);

❌ Error

Kyun?

private member class ke bahar visible nahi hai
Real Life Example
ATM PIN

Sirf account holder ko pata hota hai.

Ye private hai.

3. default (No Modifier)

Agar kuch nahi likhte:

class Employee
{
    String name = "Rahul";

    void display()
    {
        System.out.println(name);
    }
}

Yahan:

String name;
void display();

default access me hain.

✅ Same package

❌ Different package

Real Life Example
Office ke andar sab dekh sakte hain.

Office ke bahar wale nahi.
4. protected

Same package + child class access kar sakti hai.

class Animal
{
    protected void sound()
    {
        System.out.println("Animal Sound");
    }
}

Child:

class Dog extends Animal
{
    public void bark()
    {
        sound();
    }
}

✅ Same package

✅ Child class

❌ Unrelated class in different package

Real Life Example
Family Locker

Family members access kar sakte hain.
Easy Comparison Table
Modifier	Same Class	Same Package	Child Class	Other Package
public	✅	✅	✅	✅
protected	✅	✅	✅	❌
default	✅	✅	❌	❌
private	✅	❌	❌	❌
Methods with Access Modifiers
class Bank
{
    public static void openAccount()
    {
    }

    private static void verifyKYC()
    {
    }

    protected static void generateReport()
    {
    }

    static void calculateInterest()
    {
    }
}
Variable Example
class Customer
{
    public String name = "Rahul";

    private int pin = 1234;

    protected String city = "Bangalore";

    String state = "Karnataka";
}
Real ATM Example
class ATM
{
    public String bankName = "BOI";

    private int pin = 1234;

    public boolean withdraw()
    {
        return verifyPin();
    }

    private boolean verifyPin()
    {
        return true;
    }
}

Flow:

Customer
   |
   v
withdraw()
   |
   v
verifyPin()

Yahan:

withdraw()  -> public

verifyPin() -> private

Customer direct PIN verification nahi kar sakta.

Interview Question
Can we make main() private?
private static void main(String args[])
{
}

❌ JVM call nahi kar paayegi.

Correct:

public static void main(String args[])
{
}
Most Used in Real Projects
Variables
private String name;
private int age;
Methods
public void save()
{
}
Classes
public class Employee
{
}

Real projects me:

90% variables = private
Most methods = public

kyunki data ko secure rakhna hota hai.

Memory Trick
public
↓
Sab dekh sakte hain

protected
↓
Family + Child

default
↓
Same package only

private
↓
Sirf meri class

Ye access modifiers ka complete foundation hai. Agla important topic iske baad static vs non-static, constructor, aur inheritance aata hai.

====================================================================================================================================================

INPUT  : customerId, customerName, customerType, purchaseAmount
OUTPUT : discountPercentage, discountAmount, finalAmount

Customer Types:
 Regular  → 5%  discount
 Premium  → 10% discount
 VIP      → 20% discount

Business Flow:
  1. Customer enters purchase amount
  2. System identifies customer type
  3. System determines discount percentage
  4. System calculates discount amount
  5. System calculates final payable amount
  6. System displays discount details and final amount


main(args[])          ← Command Line Input
   |
   v
processOrder()        ← MASTER METHOD
   |
   +--> validateInput()        → true / false
   |
   +--> identifyCustomerType() → "Regular/Premium/VIP"
   |
   +--> getDiscountPercentage()→ 5.0 / 10.0 / 20.0
   |
   +--> calculateDiscountAmount() → discount value
   |
   +--> calculateFinalAmount() → final payable
   |
   +--> displayBill()          → prints bill
   |
   v
return "Order Processed Successfully"
   |
   v
main()
   |
   v
System.out.println(result)

 ================================================================================================================================

==========================================
       EXECUTION FLOW SUMMARY
==========================================

main(args[])
   │  reads: args[0]=1001, args[1]=Rahul
   │          args[2]=VIP, args[3]=5000
   │
   ▼
processOrder(1001, "Rahul", "VIP", 5000)   ← MASTER
   │
   ├──► validateInput()        → true      (Step 1)
   │       checks: id>0, name≠"",
   │               type≠"", amount>0
   │
   ├──► identifyCustomerType() → "VIP"     (Step 2)
   │       if Regular → "Regular"
   │       if Premium → "Premium"
   │       if VIP     → "VIP"
   │       else       → "UNKNOWN"
   │
   ├──► getDiscountPercentage()→ 20.0      (Step 3)
   │       if Regular → 5.0
   │       if Premium → 10.0
   │       if VIP     → 20.0
   │
   ├──► calculateDiscountAmount()→ 1000.0  (Step 4)
   │       formula: 5000 × 20 / 100
   │
   ├──► calculateFinalAmount() → 4000.0    (Step 5)
   │       formula: 5000 - 1000
   │
   └──► displayBill()                      (Step 6)
           prints complete formatted bill
   │
   ▼
return "✅ Order Processed | Saved:₹1000 | Pay:₹4000"
   │
   ▼
main()
   │
   ▼
System.out.println(result)
==========================================

private member, private variable, private constructor, you can call within the class only, 
not outside the class. 
The scope of private is within the class only, okay? Find it, do same practical. First, you do this.

package ===>



pwd  /Users/rahulujjawal/Desktop/core_java_kodewala/day_11/com/tcs/employee

vikashkumarjyoti@VIKASHs-MacBook-Air employee %       cd /Users/rahulujjawal/Desktop/core_java_kodewala/day_11

after compile ==> java com.tcs.employee.Accoount



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
===================================================================================================================
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
java 
com.kodewala  ---> pacakeg_name
CollegeDetails -----> class name 
 
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
mkdir -p com/tcs/employee

mkdir -p com/hcl/employee/rahulujjawal
 
pwd        # Main kis folder me hoon?
ls         # Is folder me kya files hain?
ls -R      # Pura folder structure dekho
 
				