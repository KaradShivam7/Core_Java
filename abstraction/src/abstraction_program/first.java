package abstraction_program;

public class first {

	public static void main(String[] args) {
		demo d=new demo1();
		d.show();

	}

}
abstract class demo{
	public abstract void show();
}

class demo1 extends demo{

	
	public void show() {
		System.out.println("implemented the abstract method");
	}
	
}