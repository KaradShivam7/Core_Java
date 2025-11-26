package static_variable;

public class first {

	public static void main(String[] args) {
		System.out.println("id="+student.id);
		System.out.println("name="+student.name);
		System.out.println("marks="+student.marks);
	}

}
class student{
	static int id=1;
	static String name="shiv";
	static float marks=79.49f;
}