package private_constructor;

public class second {

	public static void main(String[] args) {
		car.show();

	}

}
class car{
	private car() {
		System.out.println("inside private constructor");
	}
	
	public static void show() {
		car c=new car();
	}
}