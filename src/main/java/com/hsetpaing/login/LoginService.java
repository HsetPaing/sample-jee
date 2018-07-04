package com.hsetpaing.login;

public class LoginService {
	
	public boolean isUserValidate(String user,String password) {
		if (user.equals("hsetpaing") && password.equals("123456")) 
			return true;
		
		return false;
	}

}
