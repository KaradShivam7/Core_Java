package uss.in;

public class constructor_jumping {

	public static void main(String[] args) {
		b b=new b(10,20);
	}

}
class b{
	
	public b() {
		System.out.println("1");
	}
	
	public b(int a) {
		this();
		System.out.println("2");
	}
	
	public b(int a, int b) {
		this(10);
		System.out.println("3");
	}
}