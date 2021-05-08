import business.abstracts.UserService;
import business.concretes.AuthorizeManager;
import business.concretes.EmailLinkManager;
import business.concretes.UserManager;
import business.concretes.ValidationManager;
import core.AuthorizeService;
import core.FacebookAuthorizeManagerAdapter;
import core.GoogleAuthorizeManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import dataAccess.concretes.MysqlUserDao;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new MysqlUserDao()); // If you want to change; write
																		// HibernateUserDao() instead of MysqlUserDao()
		AuthorizeService authorizeService = new AuthorizeManager(new ValidationManager(), userService,
				new EmailLinkManager());
		authorizeService.register(1, "Mert", "Bahardogan", "mbahardogan@hotmail.com", "12344123");
		authorizeService.register(3, "Deniz", "Bahardogan", "mbahardogan@hotmail.com", "12312321"); // Wrong Register
																									// Sample

		authorizeService.logIn("mbahardogan@hotmail.com", "12344123");
		authorizeService.logIn("mbahardogan@hotmail.com", "12312321"); // Wrong Login Sample

		AuthorizeService googleAuthorizeService = new GoogleAuthorizeManagerAdapter();
		googleAuthorizeService.register(2, "Engin", "Demiroð", "edemirog@gmail.com", "12312312");
		googleAuthorizeService.logIn("edemirog@gmail.com", "12312312");

		AuthorizeService facebookAuthorizeService = new FacebookAuthorizeManagerAdapter();
		facebookAuthorizeService.register(1, "Derya", "Þahin", "desahin@facebook.com", "1231231");
		facebookAuthorizeService.logIn("desahin@facebook.com", "1231231");

	}

}
