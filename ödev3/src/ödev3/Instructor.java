package ödev3;

public class Instructor extends User{
	private int id;
	private String course;
	public Instructor() {
		
	}
	
	
	
	public Instructor(int id, String course) {
		super();
		this.id=id;
		this.course=course;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	

}
