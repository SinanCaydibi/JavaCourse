package eCommerce.business.concretes;

import java.util.List;

import eCommerce.GoogleRegisterManager;
import eCommerce.business.abstracts.RegisterService;
import eCommerce.entities.concretes.User;

public class GoogleManagerAdapters implements RegisterService{
    private GoogleRegisterManager googleRegisterManager;
	public GoogleManagerAdapters(GoogleRegisterManager googleRegisterManager) {
		super();
		this.googleRegisterManager = googleRegisterManager;
	}
	@Override
	public boolean Register(User user, List<User> userList) {
		// TODO Auto-generated method stub
		return this.googleRegisterManager.registerWithGoogle();
	}
	

}
