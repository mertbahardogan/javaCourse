package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
 	public UserManager(UserCheckService checkService) {
 		this.userCheckService=checkService;
 	};

	@Override
	public void add(User user) throws Exception {
		if(userCheckService.checkUserIsValid(user)) {
			System.out.println("New user created "+user.toString());
		}
		else {
			throw new Exception("Invalid Person");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted "+user.toString());
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated "+user.toString());
		
	}

}
