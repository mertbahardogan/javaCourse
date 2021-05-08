package dataAccess.concretes;

import java.util.*;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class MysqlUserDao implements UserDao{
	List<User> users=new ArrayList<User>();

	@Override
	public void create(User user) {
		users.add(user);
		System.out.println("User created to MySql " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
