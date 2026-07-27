package com.functionaLInterfaces;

interface Login {
	boolean add(String userId, String userPassword);

}

public class BankingLogin {
	public static void main(String[] args) {
		Login login = (userId, userPassword) ->

		{

			String iuserid = "rahul ujjawal";
			String iuserpassword = "rahul@0000";
			return userId.equals(iuserid) && userPassword.equals(iuserpassword);

		};

		boolean result = login.add("rahul ujjawal", "rahul@0000");
		System.out.println(result);
	}

}
