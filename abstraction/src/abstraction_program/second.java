package abstraction_program;

public class second {

	public static void main(String[] args) {
		main m =new main1();
	}

}
abstract class main{
	public main() {
		System.out.println("inside abstract class constructor");
	}
	
}
class main1 extends main{
	public main1() {
		System.out.println("inside class constructor");
	}
}