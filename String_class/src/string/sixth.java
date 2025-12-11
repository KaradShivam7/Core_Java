package string;

public class sixth {

	public static void main(String[] args) {
		String str="Shivam";
		String str1="shivam";
		System.out.println(str);
		System.out.println(str1);
		System.out.println("***************");
		
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		
		System.out.println("*************");
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
	}

}
