package multiple_inheritance;

public class First {

	public static void main(String[] args) {
		c c=new c();
		c.show();
		
	}

}
interface a{
	default void show() {
		System.out.println("message form a");
	}
}
interface b{
	default void show() {
		System.out.println("message form b");
	}
}
class c implements a,b{

	@Override
	public void show() {
		
		a.super.show();
		b.super.show();
		System.out.println("message form c");
	}

	
	
	
}