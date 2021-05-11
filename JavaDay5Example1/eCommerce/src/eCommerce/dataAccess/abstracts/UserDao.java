package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	User get(String email, String password);
	List<User> getAll();

}
