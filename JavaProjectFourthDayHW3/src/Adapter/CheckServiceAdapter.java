package Adapter;

import Abstract.UserCheckService;
import Entities.User;

public class CheckServiceAdapter implements UserCheckService {

	@Override
	public boolean checkUserIsValid(User user) {
		int dateOfBirth = user.getDateOfBirth().getYear();

		if (user.getNationalId().length() == 11) {
			return dateOfBirth >= 1970 && dateOfBirth <= 2000 ? true : false;
		} else {
			return false;
		}

	}

}
