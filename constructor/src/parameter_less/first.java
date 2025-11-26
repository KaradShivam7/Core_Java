package parameter_less;

public class first {

	public static void main(String[] args) {
		 
		student s=new student();
		
		System.out.println("id="+s.id+" name="+s.name+" marks="+s.marks);
	}

}

class student{
	int id;
	String name;
	float marks;
	
	public student(){
		System.out.println("inside parameter-less constructor");
		id=1;
		name="shiv";
		marks=83.00f;
	}
}