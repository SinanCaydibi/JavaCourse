package ödev3;

public class UserManager {
	public void Login(User user) {
		
		
		System.out.println(user.getFirstname()+" "+ user.getLastname() +" giriþ yaptý" );
	}
	public void LogOut(User user) {
		System.out.println(user.getFirstname()+" "+ user.getLastname() +" çýkýþ yaptý" );
	}
	
	

}
