package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void create(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	User getByEmail(String email); 
	User getByEmailAndPassword(String email,String password);
	List<User> getAll();
	void verify(User user);
	
}
