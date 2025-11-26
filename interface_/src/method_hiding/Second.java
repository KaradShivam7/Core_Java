package method_hiding;

public class Second {

	public static void main(String[] args) {
		
	 parent.show();
	 child.show();
	}

}
interface parent{
	static void show() {
		System.out.println("inside parent static method");
	}
}
class child implements parent{
	static void show() {
		System.out.println("inside child static method");
	}
}
