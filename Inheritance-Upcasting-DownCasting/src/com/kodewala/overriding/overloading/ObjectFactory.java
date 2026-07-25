package com.kodewala.overriding.overloading;

public class ObjectFactory {
	
	public static Object getObject(String name)

	{
		Object object = null;
		if (name.equalsIgnoreCase("product")) 
		{
			object = new Product();

		} else if (name.equalsIgnoreCase("ClothingProducts"))
		{
			object = new Clothing();

		} else {
			System.out.println("Inavlid Type");
		}
		return object;
	}

}



// down catsing