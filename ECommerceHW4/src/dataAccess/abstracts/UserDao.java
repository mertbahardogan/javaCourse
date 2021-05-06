package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao{
	void create(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	User getByEmail(String email); 
	User getByEmailAndPassword(String email,String password);
	List<User> getAll();
}
