package business.concretes;

import business.abstracts.ValidationService;
import entities.concretes.User;
import java.util.regex.Pattern;

public class ValidationManager implements ValidationService {

	static final Pattern MAIL_FORMAT = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	boolean result = false;

	@Override
	public boolean validate(User user) {
		if (validatePassword(user.getPassword()) && validateFirstName(user.getFirstName())
				&& validateLastName(user.getLastName()) && validateMail(user.getEmail()) == true) {

			user.setVerify(true);
			result = true;
		} else {
			result = false;
		}
		return result;

	}

	public boolean validatePassword(String password) {
		if (password.length() > 6)
			return true;
		else
			return false;
	}

	public boolean validateFirstName(String firstName) {
		if (firstName.length() > 2)
			return true;
		else
			return false;
	}

	public boolean validateLastName(String lastName) {
		if (lastName.length() > 2)
			return true;
		else
			return false;
	}

	public boolean validateMail(String email) {
		if (MAIL_FORMAT.matcher(email).find() == true)
			return true;
		else
			return false;

	}

}
