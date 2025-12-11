package string_;

public class eighth {

	public static void main(String[] args) {
		String str="shivam";
		System.out.println(str);
		System.out.println("******************");
		
		System.out.println(str.endsWith("am"));
		System.out.println(str.endsWith("s"));
		
		System.out.println("*******************");
		
		System.out.println(str.startsWith("shi"));
		System.out.println(str.startsWith("i", 2));
		
		System.out.println("********************");
		
		System.out.println(str.intern());
	}

}
