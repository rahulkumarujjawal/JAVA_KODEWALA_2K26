package day31.kodewala.overloadingmethod;

class LoginService {

	public void login(String email, String password) {
		System.out.println("Login using Email");
	}

	public void login(String Location) {
		System.out.println("Your Location : - Benglore");

	}

	public int login(int id, String source) {
		System.out.println("");
		return 10;
	}
}

public class Driver01 {
	
	
	public static void main(String[] args) {

		System.out.println("=================================");
		LoginService loginService = new LoginService();
		loginService.login("rahulujjawal@gmail.com", "**********");

		System.out.println("====================================");

	}

}
