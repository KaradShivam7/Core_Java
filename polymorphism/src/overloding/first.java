package overloding;

public class first {

	public static void main(String[] args) {
	main m =new main();
	m.add();
	System.out.println("****************************************");
	m.add(1);
	}

}
class main{
	
	public void add() {
		System.out.println("first add");
	}
	
	public void add(int a) {
		System.out.println("second add " + a);
	}
	
}