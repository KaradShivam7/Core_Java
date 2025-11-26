package overloding;

public class third {

	public static void main(String[] args) {
		demo d=new demo();
		//d.add(10.67f, 20);
		System.out.println("*********************************************");
		d.add(10, 10.30f);
	}

}
class demo1{
	
	public void add(float a, int b) {
		float c= a+b;
		System.out.println(a+"+"+b +" = "+ c);
	}
	
	public void add(int a, float b) {
		float d= a+b;
		System.out.println(a+"+"+b +" = "+d);
	}
}
