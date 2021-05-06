package business.concretes;

import business.abstracts.AuthorizeService;
import business.abstracts.EmailLinkService;
import business.abstracts.UserService;
import business.abstracts.ValidationService;
import entities.concretes.User;

public class AuthorizeManager implements AuthorizeService {

	private ValidationService validationService;
	private UserService userService;
	private EmailLinkService emailLinkService;

	public AuthorizeManager(ValidationService validationService, UserService userService,
			EmailLinkService emailLinkService) {
		this.validationService = validationService;
		this.userService = userService;
		this.emailLinkService = emailLinkService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User registerUser = new User(id, firstName, lastName, email, password, false);

		if (!validationService.validate(registerUser)) {
			System.out.println("Validation Error. Please check your informations.");
			return;
		}
		if (!(userService.getByEmail(email) == null)) {
			System.out.println("This email address is used.");
			return;
		}
		emailLinkService.sendEmail(email, "Login verification mail");
		userService.create(registerUser);
		System.out.println("Create operation is successful. Please check your email address.");
	}

	@Override
	public void logIn(String email2, String password2) {
		User logInUser=userService.getByEmailAndPassword(email2, password2);
		
		if(logInUser==null) {
			System.out.println("You've entered wrong password or email.");
			return;
		}
		if (!validationService.validate(logInUser)) {
			System.out.println("Validation Error. Please check your informations.");
			return;
		}
		System.out.println("You are in! Welcome "+logInUser.getPassword()+logInUser.getEmail());

	}

}
