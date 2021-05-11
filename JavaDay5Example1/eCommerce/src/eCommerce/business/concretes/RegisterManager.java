package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.RegisterService;
import eCommerce.core.abstracts.EmailService;
import eCommerce.core.abstracts.UserCheckService;
import eCommerce.entities.concretes.User;

public class RegisterManager  implements RegisterService{
	private UserCheckService userCheckService;
	private EmailService emailService;
	
	public RegisterManager(UserCheckService userCheckService, EmailService emailService) {
		super();
		this.userCheckService = userCheckService;
		this.emailService = emailService;
	}
	@Override
	public boolean Register(User user, List<User> userList) {
		
		if(userCheckService.checkFirstName(user.getFirstName()) && userCheckService.checkLastName(user.getLastName())
				&& userCheckService.checkPassword(user.getPassword()) && userCheckService.checkEmailAddress(user.getEmail(), userList)) 
		{
			
			System.out.println("Bilgiler geçerli.");
			
			emailService.sendEmail();
			emailService.verifyUser();
			
			return true;
		}
		System.out.println("Bilgilerinizi tekrar giriniz.");
		return false;
	}

}
