package static_block;

public class first {

	public static void main(String[] args) {
		System.out.println("id="+student.id);
		System.out.println("name="+student.name);
	}

}
class student{
	static int id;
	static String name;
	//float marks;
	
	static {
		id=1;
		name="shiv";
		//marks=79.49f;   we can't initialize instance variables in static block
	   // this.name="karad"; static block does not take this reference
	}
	
}