package business.concretes;

import business.abstracts.EmailLinkService;

public class EmailLinkManager implements EmailLinkService{

	@Override
	public void sendEmail(String email, String message) {
		System.out.println("Mail sent your "+email+" mail address. "+message);
	}

}
