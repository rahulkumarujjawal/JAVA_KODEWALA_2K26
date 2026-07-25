package com.interfaces.irctc;

public interface IUserRegistration 
{
	
	public final static int IRCTC_PRICE = 2500;
	public final static int AGE_LIMIT = 52;
	

	
	public abstract boolean irctcLogin(String user, int password);

	public abstract void register(String user, String password);

	void resetPassword(String user); // by default -->

	void logout(String user);

}
