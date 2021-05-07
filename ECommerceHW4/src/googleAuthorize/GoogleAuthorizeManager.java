package googleAuthorize;

public class GoogleAuthorizeManager {
	public void Register(String email,String password) {
		System.out.println("Register is successful with Google "+email);
	}
	
	public void LogIn(String email,String password) {
		System.out.println("Login is successful with Google "+password);
	}
}
