package com.kodewala.vehiclesystem;

public class Car implements Vehicle {

	@Override
	public void vehicleName(String name) {
		System.out.println("BMW Owner by :- Rahul Ujjawal Sharma");
		
	}

	@Override
	public void vehiclePrice(int price) 
	{
		System.out.println("Price :- 1 crore");
		
	}

	@Override
	public void vehicleColor(String color)
	{
		System.out.println("Color :- Black");
		
	}
	

	@Override
	public void vehicleModel(String modelName) 
	
	{
		System.out.println("Model Years :- 2K25BMW");
		
	}

	@Override
	public void vehicleSpeed(int spped) 
	{
		System.out.println("Your Speed :- 220");
		
	}

	@Override
	public void vehicleType(String Types) {
		System.out.println("Types :-  2026 XUV");
		
	}

}
