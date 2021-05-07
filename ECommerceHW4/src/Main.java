import business.abstracts.UserService;
import business.concretes.AuthorizeManager;
import business.concretes.EmailLinkManager;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import core.AuthorizeService;
import core.GoogleAuthorizeManagerAdapter;
import dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserDao());
		AuthorizeService authorizeService = new AuthorizeManager(new ValidationManager(), userService,
				new EmailLinkManager());
		authorizeService.register(1, "Mert", "Bahardogan", "mbahardogan@hotmail.com", "12344123");
		authorizeService.logIn("mbahardogan@hotmail.com", "12344123");
		
		
		AuthorizeService googleAuthorizeService=new GoogleAuthorizeManagerAdapter();
		googleAuthorizeService.register(2, "Engin", "Demiroð", "edemirog@gmail.com", "12312312");
		googleAuthorizeService.logIn("edemirog@gmail.com", "12312312");
	
	}

}
