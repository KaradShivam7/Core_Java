package overloding;

public class second {

	public static void main(String[] args) {
		demo d=new demo();
		d.add(10, 20);
		System.out.println("*********************************************");
		d.add(10, 10.30f);
	}

}
class demo{
	
	public void add(int a, int b) {
		int c= a+b;
		System.out.println(a+"+"+b +" = "+ c);
	}
	
	public void add(int a, float b) {
		float d= a+b;
		System.out.println(a+"+"+b +" = "+d);
	}
}