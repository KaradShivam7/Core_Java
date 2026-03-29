package Setter_Getter;

public class first {

	public static void main(String[] args) {
		student s=new student();
		s.setName("shivam");
		s.setId(1);
		s.setMarks(83.00f);
		
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getMarks());
	}

}
class student{
	private String name;                   //if we make any field as private it
	private int id;                        //is called as data hiding
	private float marks;                   // achived using getters and setters
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
}