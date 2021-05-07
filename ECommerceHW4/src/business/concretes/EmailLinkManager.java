package business.concretes;

import business.abstracts.EmailLinkService;

public class EmailLinkManager implements EmailLinkService {

	@Override
	public void sendEmail(String email) {
		System.out.println("Verification mail sent " + email + " address. ");
	}

	

}
