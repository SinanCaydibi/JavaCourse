package gameProje;

public class User {
	private int userId;
	private String userName;
	private String lastName;
	private String dateOfBirth;
	private int nationalIdentity;
	

	public User (){
		
	}


	public User(int userId, String userName, String lastName, String dateOfBirth, int nationalIdentity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalIdentity = nationalIdentity;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getNationalIdentity() {
		return nationalIdentity;
	}


	public void setNationalIdentity(int nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	
	
	
	
	
	
}
