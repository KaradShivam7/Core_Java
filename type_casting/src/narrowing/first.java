package narrowing;

public class first {

	public static void main(String[] args) {
		double d=1234.3;
		float f=123.3f;
		
		int i = (int)d;
		int num=(int)f;
		
		System.out.println("double="+ d);
		System.out.println("int="+ i);
		
		System.out.println("**********************************************");
		
		System.out.println("float="+ f);
		System.out.println("int="+ num);

	}

}
