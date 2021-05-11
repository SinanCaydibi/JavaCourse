package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	List<User> userList= new ArrayList<User>();
	
	

	@Override
	public void addUser(User user) {
		userList.add(user);
		System.out.println("Hibernate "+ " "+user.getFirstName());
		
	}

	@Override
	public User get(String email, String password) {
		for(User user : userList) {
			if(user.getEmail()==(email) && user.getPassword()==(password))
			{
				System.out.println("Kullanýcý ve þifre eþleþti");
				return user;
				
			}			
			
			
		}
		System.out.println("Kullanýcý bulunamadý.");
		
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userList;
	}
	

}
