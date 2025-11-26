package constructor_jumping;

public class first {

	public static void main(String[] args) {
		student s=new student();
		
	}

}

class student{
	
	
	public student() {
		this(1,"shiv",79.49f);
		System.out.println("inside contr-1");
	}
	
	public student(int id,String name,float marks) {
		this(34.4f,22);
		System.out.println("inside contr-2");
	}
	
	public student(float f,int i) {
		System.out.println("inside contr-3");
	}
	}