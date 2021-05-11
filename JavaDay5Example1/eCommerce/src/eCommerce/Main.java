package eCommerce;

import eCommerce.business.concretes.GoogleManagerAdapters;
import eCommerce.business.concretes.RegisterManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.EmailManager;
import eCommerce.core.concretes.UserCheckManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new HibernateUserDao(), new RegisterManager(new UserCheckManager(), new EmailManager()));

		UserManager googleUserManager = new UserManager(new HibernateUserDao(), new GoogleManagerAdapters(new GoogleRegisterManager()));
		
		User user = new User(1, "Sinan", "Çaydibi", "caydibi@gmail.com", "12345");
		
		userManager.register(user);
		
		
		System.out.println("*********************************");
		
		userManager.login(user.getEmail(), user.getPassword());
		
		System.out.println("*********************************");
		
		User user2 = new User(2, "ahmet", "sayýn", "ahmetsayýn@gmail.com", "12344");
		
		userManager.register(user2);
		
		System.out.println("*********************************");
		
		googleUserManager.register(user);
	}

}
