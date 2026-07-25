package com.abstracts.typesinterfaces;

/*
 *  @author  Rahul Ujjawal     ===> if employee class give the permission , then only he will be able to clone it , otherwise not clone \,
 *   rahul only for this one modified 
 */

class Employee implements Cloneable { // implements Cloneable :- without this class has note given permission to clone
										// the object of it
// now if used  implements Cloneable :- this gives a permission that, okay, employee class object can be cloned.
	private int id;
	public String name;
	public String Location;
	private int age;

	public Employee(int _id, String _name, String _Location, int _age) {

		super();
		this.id = _id;
		this.name = _name;
		this.Location = _Location;
		this.age = _age;

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

/*
 * @author :- Ujjawal bhaie ==> this person not modified direct without
 * permmissions
 * 
 * ujjawal only for this one modified
 * 
 */
public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee1 = new Employee(101, "Rahul ujjawal", "Benglore", 22); // here create the object and cloneed

		Employee employee2 = (Employee) employee1.clone(); // employee1 ==> copied the object ----> cloned here-- copy
															// the object
		System.out.println(employee2.name + " " + employee2.Location);
		System.out.println(employee2.Location);
		
		
		

		GoldUser golduser = new GoldUser();
		// programmatically we are checking this class is implementing    User interface or not  ==> Instance Of Operator will help  
		if (golduser instanceof User) {
			System.out.println("this is Gold User");
		} else {
			System.out.println("this is not Gold User");
		}

	}

}
