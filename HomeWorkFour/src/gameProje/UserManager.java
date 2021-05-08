package gameProje;

public  class UserManager implements UserServices{

	@Override
	public void addUser(User user) {
		System.out.println("Name:"+" "+ user.getUserName() +" "+ " LastName:"+user.getLastName()+" " +" User saved..");
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+" "+ user.getUserName() +" "+ " LastName:"+user.getLastName()+" " +" User deleted..");
	}

	@Override
	public void UpdateUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+" "+ user.getUserName() +" "+ " LastName:"+user.getLastName()+" " +" User updated..");
	}
	
	

}
