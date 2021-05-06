package dataAccess.concretes;

import java.util.*;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void create(User user) {
		users.add(user);
		System.out.println("User created to Hibernate " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		User userToUpdate = getById(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setEmail(user.getLastName());
		System.out.println("User updated to Hibernate " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		users.removeIf(obj -> obj.getId() == user.getId());
		System.out.println("FIX THIS ROW");
	}

	@Override
	public User getById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}
}
