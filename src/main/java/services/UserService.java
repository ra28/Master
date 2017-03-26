package services;

import businesslogic.UserLogic;
import businesslogic.IUserLogic;

public class UserService {

	public UserService() {
		super();
		IUserLogic userLogic = new UserLogic();
	}

}
