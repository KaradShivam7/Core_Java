package logical;

public class first {

	public static void main(String[] args) {
		String str="shiv";
		String s="";
		
		for(int i=str.length()-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		
		System.out.println("reverse string= "+s);
	}

}
