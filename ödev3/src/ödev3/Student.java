package ödev3;

public class Student extends User{
	private String comment;
	public Student () {
		
		
	}
	
	public Student (String comment) {
		super();
		this.comment=comment;
		
	}
	

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
	
	

}
