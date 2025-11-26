package method_hiding;

public class first {

	public static void main(String[] args) {
		
		a a1=new a();
		a1.show();
		a a=new b();
		a.show();
		b b=new b();
		b.show();
	}

}
class a{
	static void show() {
		System.out.println("inside parent static method");
	}
}
class b extends a{
	static void show() {
		System.out.println("inside child static method");
	}
}
