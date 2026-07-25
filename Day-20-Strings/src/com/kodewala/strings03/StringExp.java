package com.kodewala.strings03;

public class StringExp {
	public static void main(String[] args) {

		String s1 = "Rahul" + "Ujjawal"; // only one objects because compiler double string to "Rahul ujjawal" this
		// String s1 = "Rahul ujjawal"
		System.out.println();

		String s8 = "Rahul"; // scp
		String s9 = "Ujjawal"; // scp
		String s10 = s8 + s9; // Heap (run time optimization ---> String builder)

		String s11 = "RahulUjjawal"; // scp

		System.out.println(s11 == s10);
		
		System.out.println(s10 == s11);
		System.out.println(s10 + "  "+ s11);
		System.out.println(s10.equals(s11));
		
		
		s10.concat("ujjawal");
		String s12 = "rahulujjawal";
		System.out.println();
		
		
		
		String s13 = "Rahul";  // scp   === xyz 
		String s14 = new String("Rahul");  // heap  == abc  s14 == >this is pointing to object on the…  heap
		
		
		System.out.println(s13 == s14);
		
		// exection ===> left to right  
		

	}

}



/* 
 if you want to reuse it, Create string literal.
If you want, to reuse the… these values.
You will use distinct literal that goes to SCP.
If you are interested in creating new object, that means you are not interested in content you're interested in.
Object identity. Somebody asked this question, right? 

But you want to create object when the user moves from one place to another place, the same user.
if you're moving from X to Y, Y to Z, If you want to know.
How many more he did? I'm just creating scenario.
If you create this thing literal, there will be only one object.
If you create the new string object, there will be…
3 objects, that you know that, okay, this object This object, this object.


why there are two ways, but Oh.
The simple answer is that… Sometime we have a requirement where we want to
create different objects. We are interested in object identity.
Not the quantity. Okay? So that's why we are giving all the possible ways of creating object.

These, mostly in production grid system, normal application will not have these.
Some scenarios where you're interested in
For this user, how many objects created?
Okay? You're not interested in this data. You're interested in?
How many objects created for this?
then only new operator will, or new keyword will help you. Is this clear? So, in general.
This will be the approach. If you want that, okay, I'm not interested in SCP, whenever
 I perform activity, I want new object.
And that new object, you'll use for some purpose. In that case, you will do 
this. But again, this will be very common scenario. Okay, in general, you will create an object.


this, okay? So the idea of interesting object is that once somebody created, let's keep it forever till JVM runs.
Understood?
And definitely, name will be repeated, name, I'm not talking. Let's say product name, Apple 16.
Okay? City named Delhi.
country named India.
PIN code, something. So all is… all are the repeated objects, right? Same content, new object required.
So what do you do? Once created, you check if it's already there, give the same object.
Otherwise, Java will not even work, because you need huge memory.


If we are creating
If we are creating objects like such in.
two objects, you just don't consider line number 7. His question is that if you're creating this thing object like this.
This goes to HIP.
also goes to SCP.
And over this pointing heap object.
Once this method got executed, this method I consider not as a main method, because main method
Exude and heap will be.
dismantle, right? Assume this is another method, or maybe this oven is nullified.
After some time, right?
Now, the garbage collector will come.
Garbage collector will come and remove this object.
And when we remove the original object which created in heap, why do we have object in SCP,
Which doesn't have any reference, right? That was the question? Okay?
You understood the question now?

, just now you told me that, we will not be creating this object in the main method, as it will dismantle the heap.
What does… what does that, like, mean, actually?
See, let's say, if your program control came here, if your main method completed, that means execution got overwrite.
Once your execution got over, JVM will die here, it made method completed.
 So in production grid system, your server will be keep on running, that means your main method will never complete. Okay? So in this case, I'm saying, assume this is not main method, this is any other method which is called from here, and that method got executed.
So, then this object will be…
remove. This removed means it will be removed from here.
There's no reference now why SCP objectives still exist. So the idea is the reusability. Idea is that? Reusability. Okay?
Somebody said identity.
He said,
You said Identity Direct?
Identity means… Let's see… You created this object?
Another object created.
pre-object created. Okay?
Versus, if you use this, Only?
1.
Understood.
Versus, this will assume this is having… Address AJ?
XYZ?
This is what the address is,
ABC?
DEF…
A, B, C, D, F?
Yes.
So, now… If I want to do any operation.
that it created 3 different objects. This person searches, 3 different objects created. Now, if I do here, I know this is different than this, and this is different than…
this.
You understood?
If you take this example, I cannot do, because if you create such an 3 times, or 5 times, there will be only one object.
Literally only?
one object. You might have some scenario where you're not interested in the
Content. Same content you may not be looking. You may be looking how many times object created. You want to take some action.
You understood?
Is this clear?
Okay? So, yeah. In this scenario, we have only one copy, SAP, and… Definitely. Yes. Remove. Yes, yes. Optimize will be returned by 0.
Memory optimization?
From which side you're looking? I am looking from here, second.
No, no, no, no. While object creation site, or while removing? Yeah, it will remove. It will remove. But three… these three objects will be there till reference is live. Yes. Okay? But his question is, what is meaning of identity? Meaning of identity means you want to create multiple objects for the same user.
Understood.
Okay? So, you want to take some action. You want to take some action. Let's say person moved from X, Y, and J.
Okay? Now that… if he moved on Jed, he want to know that, okay, how many hawks he were having. So he'll go back.
Different object is there? Yes. Different object is there? Yes. That means he took…
three steps. X, Y, and J.
If you're doing this.
you cannot do, right? It will be always one object, it will be always one object, even one billion such an object you try to create. It will be always one. That's the meaning of identity two. Any other question?
We are ordering in advance. If you are paying your payment details, like credit card, and CBD number, which they will use spring mode, you know?
But data will store in SAP. Correct. Like, credit card number and CBD. Correct. Then anyone who can hack statements, they won't get in SAP they need the data. They will try to delete the data. If hacker is able to reach the SCP, then let him hack no?
Okay. No, no, what am I… No, no, my question, you didn't understand the question.
If it's a heap, then how? Hacker will not hack it?
No, no, Mike, what is your question?
data on heap versus SCP or security question.
Absalomes again, No, hacker will hack from SCP, not from people. No, no, again…
What is your question? I didn't understand your question. SCP versus heat, or security issue?
karlega, right?
If a person is able to reach SCP, it will reach to HEAP also. Okay? Still, I didn't understand your question. Can you rephrase your question?
Correct. Correct, correct. OTP. Right.
Okay, then? Correct. No, but if… if you have the sensory information, Use this new one.
So that when that person is no more, will be pushed?
You have both the option, right?
And… See, it's very common sense also.
That credit card number will be almost unique.
Do you think the duplicate credit card will be there? Card number?




what is meaning of identity? Meaning of identity means you want to create multiple objects for the same user.
Understood.
Okay? So, you want to take some action. You want to take some action. Let's say person moved from X, Y, and J.
Okay? Now that… if he moved on Jed, he want to know that, okay, how many hawks he were having. So he'll go back.
Different object is there? Yes. Different object is there? Yes. That means he took…
three steps. X, Y, and J.
If you're doing this.
you cannot do, right? It will be always one object, it will be always one object, even one billion such an object you try to create. It will be always one. That's the meaning of identity two. Any other question?
We are ordering in advance. If you are paying your payment details, like credit card, and CBD number, which they will use spring mode, you know?

What internal will do? 1st  will check, 
is there any object in SCP?
Yes?
Then it just starts referring.
If no, Does it work?
Copy this object. This object becomes orphan. This object will become…
orphan. An orphan object can be claimed by…
Claim by? Garbage claim. Garbage claim. Understood.
Okay?
So, there are scenarios where object will be directly created inside, even plus operator on the previous example.
S1 equal to hello, S2 equal to something, then object… the result object will be there inside?
The result will be there inside heap only, right?
Hello world will be inside.
Heap only, correct?
So, this can be… Move to?
Scp.
For optimizing purpose. Fine?
Okay, this is the purpose of interning. Any question here?
Okay, so… We will have the class test today.
Okay, I'll send… The link in the 2 to 3 minute pile.
And I'll close the online session now. You will be getting link in the WhatsApp.
There will be only one attempt allowed. Many people are doing twice.
But please don't do. You're unnecessarily doing that, okay?
Buen?
Second, all question… are right only.
Okay, before attempting, you should think, all questions are…
Right? If you're getting confused, there's some problem.

*/