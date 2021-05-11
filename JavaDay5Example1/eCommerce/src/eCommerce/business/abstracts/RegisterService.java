package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface RegisterService {
	boolean Register(User user , List<User> userList);

}
