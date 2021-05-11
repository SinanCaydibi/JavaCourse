package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {
	void register(User user);
	boolean login(String email,String password);
	

}
