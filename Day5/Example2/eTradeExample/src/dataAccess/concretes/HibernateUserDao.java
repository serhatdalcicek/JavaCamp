package dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataAccess.abstracts.IHibernateUserDao;
import entities.concretes.User;

public class HibernateUserDao implements IHibernateUserDao  {

	List<User> users;
	
	public HibernateUserDao() {
		this.users = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
        users.add(user);		
	}

	@Override
	public void delete(User user) {
        users.remove(user);		
	}

	@Override
	public void update(User user) {
       for (User users : getAll()) {
		if(users.getId() == users.getId()) {
			users.setFirstName(user.getFirstName());
			users.setLastName(user.getLastName());
			users.setEmail(user.getEmail());
		}
	}		
	}

	@Override
	public User get(String email) {
		for (User user : users) {
			if(user.getEmail() == email) {
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
