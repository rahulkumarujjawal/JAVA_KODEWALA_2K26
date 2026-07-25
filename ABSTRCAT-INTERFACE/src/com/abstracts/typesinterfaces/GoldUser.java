package com.abstracts.typesinterfaces;

interface User{
	
	
	
}
public class GoldUser implements User{
 
}

/*
 * If you want to transfer over the network, what you do? You convert this object to… byte streams.
Those bytes will be sent over the network, and whoever wants to use.
they will convert the bystream to object. That process is called deserialization, and that object will be… created here.
Okay, that is the deserialization. But we will have one class how deserialization works and how do we deserialize object, okay? But just from the marker point of view.
Clothing and serialization. You just understand these are the critical activities, and to perform the critical activity, your class must implement
the market interface. If your class want to serialize its object.
For class 1 to allow the serialization, then class will be implemented serializable.
And if class want to allow the clothing, class must be implementing clothing.



this interface will give special permission to the JVM.
or a special instruction to the JVM, please clone the
object of the particular class. Particular class, class B is class B, Implements the interface.
So this class object can be cloned. If this is not implementing, your JVM will not allow.
Clothing. How decision taken?
Even is the instance of?
Clonable.
That check is happening, right? Inside the clone method. If you go inside clone method, you cannot directly see, because it's in the T method. Okay?
But they will take decisions based on something like, you have…
They will have something like this.
if… Water object you're clothing, right?
instance… Off… cloneable, okay?
then activity allow. Otherwise, don't allow.
Understood. Now, this will be true only if your object
that employee class is implementing clonable, otherwise it will not be. That is what we are understanding.
Here, right.
Okay, here, if this is to allow the activity, otherwise don't allow.
 *    
 *    
 *    
 * assigmnet :- 
 * 
 *    
 * create your own market interface. In interview, they will be asking, can we create our own market interface?
The lost and found, people use personality, okay? Yes. Okay.
Understood?
So, can we have our own marketing interface? Yes. Write the interface, which is empty. How will you use?
the activity which I want to perform.
And I should not allow that activity
to everyone. Whoever is implementing my market interface, Those people will only… Perform those activities.
Is this clear?
So, what is the purpose of market interface? It's an empty interface, it gives a special instruction to JVM to perform some of the activities.
In existing Java, some of the activities are cloning for that clonable interface, serializable interface for serialization. If you want to implement your own market interface, you can have the interface.
Do not write anything method, anything inside the interface.
That interface is market interface, and you have certain activity in your application that
Should not be used by everywhere. Should not be used by?
Everywhere.
 *    
 *    
 *    
 *    
 *    
 * Using market interface. Inside your method, you put
That object.instanceOfMarker, allow active, otherwise say, get lost.
Understood?
Okay? So this question, you have to implement your own market interface and develop one functionality?
Where?
If your class is implementing, Your market interface, allow activity, otherwise I do not allow.
Okay? I don't want you to get into the logic and all.
I don't want you to get into the logic and all.
Okay.
But just paint, like, activity allowed, not allowed, like I printed here.
Understood? So, take 5-minute break, then we will have. Any question here before that?
 *    
 *    
 */
