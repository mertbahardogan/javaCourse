package core;

import googleAuthorize.GoogleAuthorizeManager;

public class GoogleAuthorizeManagerAdapter implements AuthorizeService{

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		GoogleAuthorizeManager googleAuthorizeManager=new GoogleAuthorizeManager();
		googleAuthorizeManager.Register(email, password);
	}

	@Override
	public void logIn(String email, String password) {
		GoogleAuthorizeManager googleAuthorizeManager=new GoogleAuthorizeManager();
		googleAuthorizeManager.LogIn(email, password);
		
	}

	@Override
	public boolean matchCode(int code) {
		return true;
	}

}
