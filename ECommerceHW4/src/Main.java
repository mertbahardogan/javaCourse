import business.abstracts.AuthorizeService;
import business.abstracts.UserService;
import business.concretes.AuthorizeManager;
import business.concretes.EmailLinkManager;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserDao());
		AuthorizeService authorizeService = new AuthorizeManager(new ValidationManager(), userService,
				new EmailLinkManager());
		authorizeService.register(1, "Mert", "Bahardogan", "mbahardogan@hotmail.com", "12344123");
		authorizeService.logIn("mbahardogan@hotmail.com", "12344123");
	}

}
