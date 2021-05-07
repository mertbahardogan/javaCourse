package core;

public interface AuthorizeService {
	void register(int id, String firstName, String lastName, String email, String password);

	void logIn(String email, String password);

	boolean matchCode(int code);
}
