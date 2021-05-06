package business.abstracts;

import entities.concretes.User;

public interface ValidationService {

	boolean validate(User user);
}
