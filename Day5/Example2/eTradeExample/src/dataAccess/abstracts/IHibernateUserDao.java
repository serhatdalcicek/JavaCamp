package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface IHibernateUserDao {
	void add(User user);

	void delete(User user);

	void update(User user);

	User get(String email);

	List<User> getAll();
}
