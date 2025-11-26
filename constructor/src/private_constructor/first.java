package private_constructor;

public class first {

	public static void main(String[] args) {
		student s=new student();

	}

}
class student{
	public student() {
		this(1);
		System.out.println("inside public constructor");
	}
	
	private student(int i) {
		System.out.println("inside private constructor");
	}
}