package getclass;

public class First {

	public static void main(String[] args) {
		demo d=new demo();
		main m=new main();
		System.out.println("class name = "+ d.getClass());
		System.out.println("class name = "+m.getClass());
	}

}
class demo{
	
}

class main{}