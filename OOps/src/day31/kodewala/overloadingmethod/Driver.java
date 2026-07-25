package day31.kodewala.overloadingmethod;

import java.security.PrivilegedActionException;

public class Driver

{
	public static void main(String[] args)
	{
		UserRegistration userRegistration = new UserRegistration();
		
		
		System.out.println("========Your Registration=========\n");
		userRegistration.doRegistration("6477-9393-9393-9393");
		
		
	}

}
