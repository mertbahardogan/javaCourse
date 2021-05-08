package core;

import facebookAuthorize.FacebookAuthorizeManager;

public class FacebookAuthorizeManagerAdapter implements AuthorizeService {

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		FacebookAuthorizeManager facebookAuthorizeManager = new FacebookAuthorizeManager();
		facebookAuthorizeManager.Register(email, password);
	}

	@Override
	public void logIn(String email, String password) {
		FacebookAuthorizeManager facebookAuthorizeManager = new FacebookAuthorizeManager();
		facebookAuthorizeManager.LogIn(email, password);
	}

	@Override
	public boolean matchCode(int code) {
		return true;
	}

}
