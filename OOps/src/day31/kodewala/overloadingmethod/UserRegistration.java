package day31.kodewala.overloadingmethod;

public class UserRegistration {
	
	// multipale veriosn of Do Registration
	public void doRegistration(String mobile, int otp) {      // v1

		System.out.println("UserRegistration.doRegistration(String mobile,int otp)");

	}

	public int doRegistration(String adhar) {        // v2

		System.out.println("UserRegistration.doRegistration(String adhar)");
		return 0;

	}

	public void doRegistration(String d1, String voterId) {   // v3

		System.out.println("UserRegistration.doRegistration(String d1, String voterId)");

	}

	public void doRegistration(int pin, String atm) {   // v4

		System.out.println("UserRegistration.doRegistration(int pin ,String atm)");

	}

	
	public void doRegistration(int pancard) {   // v5

		System.out.println("UserRegistration.doRegistration(int pancard))");

	}

}
