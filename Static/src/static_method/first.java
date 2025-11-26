package static_method;

public class first {

	public static void main(String[] args) {
		student.show();
	}

}
class student{
	static int id;
	static String name;
	static float marks;
	String course="BE";
	
	static {
		id=1;
		name="shiv";
		marks=83.00f;
	}
	
	public static void show() {
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("marks="+marks);
		//System.out.println("course="+course); can't access instance variables in static method
	}
	
}